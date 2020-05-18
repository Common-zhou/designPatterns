package com.geetest.factory.simplefactory;

/**
 * @author zhoubing
 * @date 2020-05-18 15:18
 */
public class MoveableFactory {
    public static Moveable getCar(){
        return new Car();
    }

    public static Moveable getPlane(){
        return new Plane();
    }
}
