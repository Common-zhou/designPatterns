package com.zhou.rule_02.factory;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 发奖程序 根据传入type 决定发放奖品
 *
 * @author zhoubing
 * @since 2021/11/24 10:17
 */
@Slf4j
public class PrizeController {
  public Map<String, String> prize(PrizeInfo prizeInfo) {
    if (prizeInfo == null) {
      throw new IllegalArgumentException(String.format("illegal prizeInfo,please check.%s", prizeInfo));
    }
    Map<String, String> map = new HashMap<String, String>();

    if (PrizeInfo.type.ENTITY.equals(prizeInfo.getPrizeType())) {
      // 如果是实物奖励
      log.info("send entity. [info={}]", prizeInfo);
    } else if (PrizeInfo.type.VIRTUAL.equals(prizeInfo.getPrizeType())) {
      // 如果是虚拟奖励
      log.info("send virtual. [info={}]", prizeInfo);
    } else if (PrizeInfo.type.QQ_MUSIC.equals(prizeInfo.getPrizeType())) {
      // qq音乐奖品
      log.info("send qq music . [info={}]", prizeInfo);
    }

    return map;

  }

}
