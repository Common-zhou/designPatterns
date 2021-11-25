package com.zhou.rule_02.abstract_factory;

import com.zhou.rule_02.abstract_factory.service.CacheService;
import com.zhou.rule_02.abstract_factory.service.impl.CacheServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/11/25 10:23
 */
public class TestCacheService {
  @Test
  public void testCacheService() {
    CacheService cacheService = new CacheServiceImpl();

    cacheService.set("test_key", "test_value");
    String value = cacheService.get("test_key");

    System.out.println(String.format("get key[test_key=%s]", value));

    cacheService.delete("test_key");

    cacheService.set("test_key_expire", "test_value", 10, TimeUnit.DAYS);

    System.out.println(String.format("get key[test_key=%s]", cacheService.get("test_key")));
  }
}
