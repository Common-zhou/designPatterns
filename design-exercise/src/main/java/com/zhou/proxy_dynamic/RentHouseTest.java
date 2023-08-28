package com.zhou.proxy_dynamic;

import java.lang.reflect.Proxy;

/**
 * @author Common-zhou
 * @since 2023-08-28 15:21
 */
public class RentHouseTest {
    public static void main(String[] args) {

        IRentHouse iRentHouse = new RealRenter();

        ClassLoader cl = RentHouseTest.class.getClassLoader();

        IRentHouse rentHouse = (IRentHouse) Proxy.newProxyInstance(cl, new Class[]{IRentHouse.class},
            new RentHouseProxy(iRentHouse));

        boolean rent = rentHouse.rent(1000);
        System.out.println(rent);
    }
}
