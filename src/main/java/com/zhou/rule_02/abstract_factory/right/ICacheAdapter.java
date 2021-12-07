package com.zhou.rule_02.abstract_factory.right;

import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/11/25 20:21
 */
public interface ICacheAdapter {
  String get(String key);

  void set(String key, String value);

  void set(String key, String value, long expireTime, TimeUnit timeUnit);

  String delete(String key);
}
