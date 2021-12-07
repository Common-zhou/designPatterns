package com.zhou.rule_02.abstract_factory.right;

import com.zhou.rule_02.abstract_factory.EGM;

import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/11/25 20:25
 */
public class EGMAdapter implements ICacheAdapter {

  private EGM egm = new EGM();

  @Override
  public String get(String key) {
    return egm.gain(key);
  }

  @Override
  public void set(String key, String value) {
    egm.set(key, value);
  }

  @Override
  public void set(String key, String value, long expireTime, TimeUnit timeUnit) {
    egm.setEx(key, value, expireTime, timeUnit);
  }

  @Override
  public String delete(String key) {
    return egm.delete(key);
  }
}
