package com.geetest.factory.simplefactory;

/**
 * @author zhoubing
 * @date 2020-05-28 22:54
 */
public class Main2 {
    public static void main(String[] args) {
        Moveable moveable = MoveableFactory2.getMovableByName("CAR");

        if (moveable == null){
            return;
        }
        moveable.run();


        Moveable moveable2 = MoveableFactory2.getMovableByName("Plane");
        moveable2.run();

        Moveable moveable3 = MoveableFactory2.getMovableByName("train");
        if (moveable3 == null){
            System.out.println("movable3 is null");
        }
    }
}
