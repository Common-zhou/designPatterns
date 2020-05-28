package com.geetest.factory.simplefactory;

/**
 * @author zhoubing
 * @date 2020-05-28 23:01
 */
public class Main3 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Moveable moveable = MoveableFactory2.getMoveableByClass(Car.class);
        moveable.run();

        Moveable moveable1 = MoveableFactory2.getMoveableByClass(Plane.class);
        moveable1.run();

        Moveable moveableByClass = MoveableFactory2.getMoveableByClass(Main2.class);
        if (moveableByClass==null){
            System.out.println("moveabelByClass is null!");
        }
    }
}
