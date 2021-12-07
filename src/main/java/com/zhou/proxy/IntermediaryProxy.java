package com.zhou.proxy;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/12/07 10:26
 */
public class IntermediaryProxy implements IRentHouse {

  private IRentHouse iRentHouse;

  public IntermediaryProxy(IRentHouse iRentHouse) {
    this.iRentHouse = iRentHouse;
  }

  @Override
  public void rentHouse() {
    System.out.println("give money to intermediary proxy.");
    iRentHouse.rentHouse();
    System.out.println("intermediary proxy fix and service.");
  }
}
