package com.zhou.rule_02.abstract_factory.service;

import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/11/25 10:16
 */
public interface CacheService {
  String get(String key);

  void set(String key, String value);

  void set(String key, String value, long expireTime, TimeUnit timeUnit);

  String delete(String key);
}
