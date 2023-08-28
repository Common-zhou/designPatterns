package com.zhou.proxy;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/12/07 10:24
 */
public class HouseOwner implements IRentHouse {
  @Override
  public void rentHouse() {
    System.out.println("Rent house by house owner.");
  }
}
