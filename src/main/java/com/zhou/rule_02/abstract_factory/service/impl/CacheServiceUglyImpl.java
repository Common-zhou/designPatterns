package com.zhou.rule_02.abstract_factory.service.impl;

import com.zhou.rule_02.abstract_factory.EGM;
import com.zhou.rule_02.abstract_factory.IIR;
import com.zhou.rule_02.abstract_factory.RedisUtil;
import com.zhou.rule_02.abstract_factory.service.CacheService;

import java.util.concurrent.TimeUnit;

/**
 * 很直接的想法是 用一个redisType去标识 采用的什么redis连接()
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/11/25 10:21
 */
public class CacheServiceUglyImpl implements CacheService {

  private RedisUtil redisUtil = new RedisUtil();
  private EGM egm = new EGM();
  private IIR iir = new IIR();

  private Integer redisType = 1;

  public CacheServiceUglyImpl(int redisType) {
    this.redisType = redisType;
  }

  @Override
  public String get(String key) {
    if (redisType == 1) {
      return egm.gain(key);
    } else if (redisType == 2) {
      return iir.get(key);
    }

    return redisUtil.get(key);
  }

  @Override
  public void set(String key, String value) {
    if (redisType == 1) {
      egm.set(key, value);
      return;
    } else if (redisType == 2) {
      iir.set(key, value);
      return;
    }

    redisUtil.set(key, value);
  }

  @Override
  public void set(String key, String value, long expireTime, TimeUnit timeUnit) {
    if (redisType == 1) {
      egm.setEx(key, value, expireTime, timeUnit);
      return;
    } else if (redisType == 2) {
      iir.setExpire(key, value, expireTime, timeUnit);
      return;
    }

    redisUtil.set(key, value, expireTime, timeUnit);
  }

  @Override
  public String delete(String key) {

    if (redisType == 1) {
      return egm.delete(key);
    } else if (redisType == 2) {
      return iir.del(key);
    }
    return redisUtil.del(key);
  }
}
