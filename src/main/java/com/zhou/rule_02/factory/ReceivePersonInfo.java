package com.zhou.rule_02.factory;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhoubing
 * @since 2021/11/24 10:19
 */
@Accessors(chain = true)
@Data
public class ReceivePersonInfo {
  private String name;
  private String phone;
  private String address;
  private String account;
  private String email;
}
