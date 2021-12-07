package com.zhou.proxy;

import org.junit.jupiter.api.Test;

/**
 * @author zhoubing
 * @since 2021/12/07 10:30
 */
public class TestRentHouse {
  @Test
  public void testRentHouse() {
    System.out.println("===================");
    IRentHouse iRentHouse = new HouseOwner();
    iRentHouse.rentHouse();
    System.out.println("===================");
    IntermediaryProxy proxy = new IntermediaryProxy(iRentHouse);
    proxy.rentHouse();

  }
}
