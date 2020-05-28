package com.geetest.factory.simplefactory;

/**
 * @author zhoubing
 * @date 2020-05-28 22:51
 */
public class MoveableFactory2 {
    public static Moveable getMovableByName(String name){
        if ("car".equalsIgnoreCase(name)){
            return new Car();
        }else if ("plane".equalsIgnoreCase(name)){
            return new Plane();
        }
        return null;
    }

    public static Moveable getMoveableByClass(Class cla) throws IllegalAccessException, InstantiationException {
        Object instance = cla.newInstance();
        if (instance instanceof Moveable){
            return (Moveable) instance;
        }else{
            return null;
        }
    }
}
