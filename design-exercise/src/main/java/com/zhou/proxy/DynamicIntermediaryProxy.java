package com.zhou.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/12/07 16:50
 */
public class DynamicIntermediaryProxy implements InvocationHandler {

  private IRentHouse iRentHouse;

  public DynamicIntermediaryProxy(IRentHouse iRentHouse) {
    this.iRentHouse = iRentHouse;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    //System.out.println(proxy);
    //boolean b = proxy == this;
    //System.out.println(b);

    System.out.println("dynamic before=================");
    Object invoke = method.invoke(iRentHouse, args);
    System.out.println("dynamic after=================");



    return invoke;
  }
}
