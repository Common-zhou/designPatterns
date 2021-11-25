package com.zhou.rule_02.abstract_factory;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * egm 管理redis
 *
 * @author zhoubing
 * @since 2021/11/25 10:12
 */
@Slf4j
public class EGM {
  private Map<String, String> holder = new ConcurrentHashMap<>();

  public String gain(String key) {
    log.info("gain from redis.[key={}]", key);
    return holder.get(key);
  }


  public String set(String key, String value) {
    log.info("set redis.[key={}, value={}]", key, value);
    return holder.put(key, value);
  }

  public String setEx(String key, String value, long expire, TimeUnit timeUnit) {
    log.info("set redis for expire.[key={}, value={}, expire={}, timeunit={}]", key, value, expire,
        timeUnit.toString());
    return holder.put(key, value);
  }

  public String delete(String key) {
    log.info("delete from redis.[key={}]", key);
    return holder.remove(key);
  }
}
