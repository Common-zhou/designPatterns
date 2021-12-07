package com.zhou.rule_02.abstract_factory.right;

import com.zhou.rule_02.abstract_factory.IIR;

import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/11/25 20:26
 */
public class IIRAdapter implements ICacheAdapter {
  private IIR iir = new IIR();

  @Override
  public String get(String key) {
    return iir.get(key);
  }

  @Override
  public void set(String key, String value) {
    iir.set(key, value);
  }

  @Override
  public void set(String key, String value, long expireTime, TimeUnit timeUnit) {
    iir.setExpire(key, value, expireTime, timeUnit);
  }

  @Override
  public String delete(String key) {
    return iir.del(key);
  }
}
