package com.zhou;

import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2022/06/05 23:10
 */
public class TestCus {
  public static void main(String[] args) {
    CusMetrics cusMetrics = new CusMetrics();

    cusMetrics.startRepeatedReport(10, TimeUnit.SECONDS);
  }
}
