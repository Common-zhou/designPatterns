package com.zhou.proxy_static;

/**
 * @author Common-zhou
 * @since 2023-08-28 14:34
 */
public class RealRenter implements IRentHouse {
    @Override
    public boolean rent(Integer money) {
        System.out.println("出" + money + "租房。。。");
        return true;
    }
}
