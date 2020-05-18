package com.geetest.singleton;

/**
 * @author zhoubing
 * @date 2020-05-18 11:28
 */
public class Singleton2 {
    private Singleton2() {

    }

    static Singleton2 singleton2;

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                //双重检查  必须要双重检查
                //图解见图片 双重检查(double check).png
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }

    public static void main(String[] args) {

    }
}
