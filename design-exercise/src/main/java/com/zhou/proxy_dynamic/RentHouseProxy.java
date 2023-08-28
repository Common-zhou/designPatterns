package com.zhou.proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 租房代理。这个需要实现InvocationHandler
 *
 * @author Common-zhou
 * @since 2023-08-28 15:13
 */
public class RentHouseProxy implements InvocationHandler {

    private Object target;

    public RentHouseProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("前期准备工作......");
        Object result = method.invoke(this.target, args);
        System.out.println("后期收尾工作......");

        return result;
    }
}
