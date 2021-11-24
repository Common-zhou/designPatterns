package com.zhou.rule_02.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/11/25 00:25
 */
@Slf4j
public class EntityPrize implements Prize {

  @Override
  public PrizeResult send(PrizeInfo prizeInfo) {

    PrizeResult result = new PrizeResult();

    if (prizeInfo == null || prizeInfo.getPersonInfo() == null) {
      result.setCode("001");
      result.setMsg("发奖人信息为空，请检查");
      return result;
    }

    // 实物发奖
    ReceivePersonInfo personInfo = prizeInfo.getPersonInfo();
    log.info("entity prize.prizeInfo=[{}]", prizeInfo);


    result.setMsg("发奖成功");
    result.setCode("100");
    return result;
  }
}
