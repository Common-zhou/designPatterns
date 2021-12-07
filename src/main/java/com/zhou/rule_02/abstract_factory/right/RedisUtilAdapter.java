package com.zhou.rule_02.abstract_factory.right;

import com.zhou.rule_02.abstract_factory.RedisUtil;

import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/11/25 20:22
 */
public class RedisUtilAdapter implements ICacheAdapter {
  private RedisUtil redisUtil = new RedisUtil();

  @Override
  public String get(String key) {
    return redisUtil.get(key);
  }

  @Override
  public void set(String key, String value) {
    redisUtil.set(key, value);
  }

  @Override
  public void set(String key, String value, long expireTime, TimeUnit timeUnit) {
    redisUtil.set(key, value, expireTime, timeUnit);
  }

  @Override
  public String delete(String key) {
    return redisUtil.del(key);
  }
}
