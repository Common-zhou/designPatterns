package com.zhou.proxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

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

  @Test
  public void testDynamicIntermediary() {
    HouseOwner houseOwner = new HouseOwner();

    DynamicIntermediaryProxy dynamicIntermediaryProxy = new DynamicIntermediaryProxy(houseOwner);
    IRentHouse iRentHouse = (IRentHouse) Proxy.newProxyInstance(DynamicIntermediaryProxy.class.getClassLoader(),
        new Class[] {IRentHouse.class}, dynamicIntermediaryProxy);

    iRentHouse.rentHouse();

  }
}
