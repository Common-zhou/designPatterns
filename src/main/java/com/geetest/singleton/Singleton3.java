package com.geetest.singleton;

/**
 * @author zhoubing
 * @date 2020-05-18 11:44
 *
 *   静态内部类方式
 *   JVM保证单例
 *   加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Singleton3 {

    private Singleton3(){}

    private static class Holder{
        private static Singleton3 singleton3 = new Singleton3();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(getInstance().hashCode());
        }
    }

    public static Singleton3 getInstance(){
        return Holder.singleton3;
    }
}
