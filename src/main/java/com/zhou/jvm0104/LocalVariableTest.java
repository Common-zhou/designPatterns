package com.zhou.jvm0104;

/**
 * @author zhoubing
 * @since 2022/03/01 23:20
 */
public class LocalVariableTest {
  public static void main(String[] args) {
    MovingAverage ma = new MovingAverage();
    int num1 = 1;
    int num2 = 2;

    ma.submit(num1);
    ma.submit(num2);

    double avg = ma.getAvg();
  }
}
