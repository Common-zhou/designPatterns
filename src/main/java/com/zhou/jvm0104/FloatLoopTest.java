package com.zhou.jvm0104;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2022/03/01 23:53
 */
public class FloatLoopTest {
  public static void main(String[] args) {
    MovingAverage ma = new MovingAverage();
    for (int i = 0; i < 10; i++) {
      ma.submit(i);
    }
    double avg = ma.getAvg();
  }
}
