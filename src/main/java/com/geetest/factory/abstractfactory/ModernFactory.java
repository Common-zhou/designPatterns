package com.geetest.factory.abstractfactory;

/**
 * @author zhoubing
 * @date 2020-05-18 15:40
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Weapon getWeapon() {
        return new Ak47();
    }

    @Override
    Food getFood() {
        return new Bread();
    }

    @Override
    Vehicle getVehicle() {
        return new Car();
    }
}
