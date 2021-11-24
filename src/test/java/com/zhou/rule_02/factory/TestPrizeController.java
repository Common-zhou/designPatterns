package com.zhou.rule_02.factory;

import org.junit.jupiter.api.Test;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/11/25 00:03
 */
public class TestPrizeController {
  @Test
  public void testPrizeController() {
    PrizeController prizeController = new PrizeController();

    PrizeInfo entityPrizeInfo = new PrizeInfo()
        .setPrizeType(PrizeInfo.type.ENTITY).setPersonInfo(
            new ReceivePersonInfo().setAddress("hubei").setName("zhouzhou").setPhone("110"));

    // 测试实体奖品
    prizeController.prize(entityPrizeInfo);

    PrizeInfo virtualPrizeInfo = new PrizeInfo()
        .setPrizeType(PrizeInfo.type.VIRTUAL).setPersonInfo(
            new ReceivePersonInfo().setAccount("account").setName("zhouzhou").setPhone("110"));
    // 测试虚拟奖品
    prizeController.prize(virtualPrizeInfo);

    PrizeInfo qqPrizeInfo = new PrizeInfo()
        .setPrizeType(PrizeInfo.type.QQ_MUSIC).setPersonInfo(
            new ReceivePersonInfo().setAccount("qq account").setName("zhouzhou").setPhone("110"));
    // 测试虚拟奖品
    prizeController.prize(qqPrizeInfo);



  }

  @Test
  public void testSingle(){
    Prize prize = new EntityPrize();
    PrizeInfo entityPrizeInfo = new PrizeInfo()
        .setPrizeType(PrizeInfo.type.ENTITY).setPersonInfo(
            new ReceivePersonInfo().setAddress("hubei").setName("zhouzhou").setPhone("110"));


    PrizeResult entityRes = prize.send(entityPrizeInfo);
    System.out.println(entityRes);

    prize = new VirtualPrize();
    System.out.println(prize.send(entityPrizeInfo));

  }
}
