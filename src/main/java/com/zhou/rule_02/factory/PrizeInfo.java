package com.zhou.rule_02.factory;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhoubing
 * @since 2021/11/24 10:21
 */
@Data
@Accessors(chain = true)
public class PrizeInfo {
  enum type {
    ENTITY, VIRTUAL, QQ_MUSIC
  }

  private type prizeType;
  private ReceivePersonInfo personInfo;
}
