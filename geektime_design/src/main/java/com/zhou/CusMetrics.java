package com.zhou;

import static java.util.Collections.max;
import static java.util.Collections.min;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author zhoubing
 * @since 2022/06/05 22:51
 */
public class CusMetrics {
  private Map<String, List<Double>> startTimeMap = new HashMap<>();
  private Map<String, List<Double>> responseTimeMap = new HashMap<>();

  public void recordTimestamp(String apiName, double startTime) {
    startTimeMap.putIfAbsent(apiName, Lists.newArrayList());

    startTimeMap.get(apiName).add(startTime);
  }

  public void recordResponseTime(String apiName, Double responseTime) {
    responseTimeMap.putIfAbsent(apiName, Lists.newArrayList());

    responseTimeMap.get(apiName).add(responseTime);
  }

  public void startRepeatedReport(long time, TimeUnit timeUnit) {
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
    // 10s一次 固定速率
    scheduledExecutorService.scheduleWithFixedDelay(() -> {
      // 统计值。以apiName为key value中的map。以以下格式{min: 2.0, max: 10,avg:6.6}
      Map<String, Map<String, Double>> stats = new HashMap<>();
      for (Map.Entry<String, List<Double>> entry : responseTimeMap.entrySet()) {
        String apiName = entry.getKey();
        List<Double> responseTimes = entry.getValue();

        stats.putIfAbsent(apiName, new HashMap<>());
        stats.get(apiName).put("max", max(responseTimes));
        stats.get(apiName).put("min", min(responseTimes));
        stats.get(apiName).put("avg", avg(responseTimes));

      }

      for (Map.Entry<String, List<Double>> entry : startTimeMap.entrySet()) {
        String apiName = entry.getKey();
        List<Double> apiTimestamps = entry.getValue();
        stats.putIfAbsent(apiName, new HashMap<>());
        stats.get(apiName).put("count", (double) apiTimestamps.size());
      }

      System.out.println(JSON.toJSONString(stats));

    }, 0, time, timeUnit);

  }

  private Double avg(List<Double> responseTimes) {
    if (CollectionUtils.isEmpty(responseTimes)) {
      return 0D;
    }
    Double sum = 0D;

    for (Double responseTime : responseTimes) {
      sum += responseTime;
    }

    return sum / responseTimes.size();
  }
}
