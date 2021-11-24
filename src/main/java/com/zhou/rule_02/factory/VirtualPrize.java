package com.zhou.rule_02.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/11/25 00:30
 */
@Slf4j
public class VirtualPrize implements Prize {

  @Override
  public PrizeResult send(PrizeInfo prizeInfo) {

    ReceivePersonInfo personInfo = prizeInfo.getPersonInfo();


    log.info("send virtual prize.[prizeInfo={}]", prizeInfo);
    return new PrizeResult().setCode("0000").setMsg("成功");
  }
}
