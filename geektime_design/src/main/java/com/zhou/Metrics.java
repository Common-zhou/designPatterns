package com.zhou;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Metrics {
  // Map的key是接口名称，value对应接口请求的响应时间或时间戳；
  private Map<String, List<Double>> responseTimes = new HashMap<>();
  private Map<String, List<Double>> timestamps = new HashMap<>();
  private ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

  public void recordResponseTime(String apiName, double responseTime) {
    responseTimes.putIfAbsent(apiName, new ArrayList<>());
    responseTimes.get(apiName).add(responseTime);
  }

  public void recordTimestamp(String apiName, double timestamp) {
    timestamps.putIfAbsent(apiName, new ArrayList<>());
    timestamps.get(apiName).add(timestamp);
  }

  public void startRepeatedReport(long period, TimeUnit unit) {
    executor.scheduleAtFixedRate(new Runnable() {
      @Override
      public void run() {
        Map<String, Map<String, Double>> stats = new HashMap<>();
        for (Map.Entry<String, List<Double>> entry : responseTimes.entrySet()) {
          String apiName = entry.getKey();
          List<Double> apiRespTimes = entry.getValue();
          stats.putIfAbsent(apiName, new HashMap<>());
          stats.get(apiName).put("max", max(apiRespTimes));
          stats.get(apiName).put("avg", avg(apiRespTimes));
        }

        for (Map.Entry<String, List<Double>> entry : timestamps.entrySet()) {
          String apiName = entry.getKey();
          List<Double> apiTimestamps = entry.getValue();
          stats.putIfAbsent(apiName, new HashMap<>());
          stats.get(apiName).put("count", (double) apiTimestamps.size());
        }
        System.out.println(JSON.toJSONString(stats));
      }
    }, 0, period, unit);
  }

  private double max(List<Double> dataset) {
    return Collections.max(dataset);
  }

  private double avg(List<Double> dataset) {
    OptionalDouble average = dataset
        .stream()
        .mapToDouble(a -> a)
        .average();
    return average.getAsDouble();
  }
}