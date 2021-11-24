package com.zhou.rule_02.factory;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/11/25 00:24
 */
@Data
@Accessors(chain = true)
public class PrizeResult {
  private String code;
  private String msg;
}
