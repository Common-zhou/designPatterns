package com.geetest.factory.abstractfactory;

/**
 * @author zhoubing
 * @date 2020-05-18 15:28
 */
public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.go();
//
//        Ak47 ak47 = new Ak47();
//        ak47.shoot();
//
//        Bread bread = new Bread();
//        bread.showName();


        ModernFactory factory = new ModernFactory();
//        MagicFactory factory = new MagicFactory();
        Vehicle vehicle = factory.getVehicle();
        Weapon weapon = factory.getWeapon();
        Food food = factory.getFood();

        vehicle.go();
        weapon.shoot();
        food.showName();


    }
}
