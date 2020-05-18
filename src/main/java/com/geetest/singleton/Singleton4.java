package com.geetest.singleton;

/**
 * @author zhoubing
 * @date 2020-05-18 11:47
 */
public enum  Singleton4 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(INSTANCE.hashCode());
        }
    }
}
