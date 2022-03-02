package com.zhou.jvm0104;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2022/03/01 23:19
 */
public class MovingAverage {
  private int count;
  private double sum = 0.0D;

  public void submit(double value) {
    this.count++;
    this.sum += value;
  }

  public double getAvg(){
    if (0 == this.count){
      return sum;
    }
    return this.sum / this.count;
  }
}
