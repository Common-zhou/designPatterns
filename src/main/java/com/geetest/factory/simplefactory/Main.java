package com.geetest.factory.simplefactory;

/**
 * @author zhoubing
 * @date 2020-05-18 15:08
 */
public class Main {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.run();

//        Plane plane = new Plane();
//        plane.run();
//        Moveable m = new Car();
        Moveable m = new Plane();
        m.run();

        //Moveable moveable = MoveableFactory.getCar();
        //moveable.run();

        Moveable moveable = MoveableFactory.getPlane();
        moveable.run();

    }
}
