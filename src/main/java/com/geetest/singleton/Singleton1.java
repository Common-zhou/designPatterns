package com.geetest.singleton;

/**
 * @author zhoubing
 * @date 2020-05-18 11:20
 */
public class Singleton1 {
    private Singleton1(){

    }
    static Singleton1 singleton1 = new Singleton1();

    public static Singleton1 getInstance(){
        return singleton1;
    }

    public static void main(String[] args) {

    }
}
