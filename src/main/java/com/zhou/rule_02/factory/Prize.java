package com.zhou.rule_02.factory;

/**
 * 发奖的接口 只要发奖 就用它
 *
 * @author zhoubing
 * @since 2021/11/25 00:23
 */
public interface Prize {
  PrizeResult send(PrizeInfo prizeInfo);
}
