package com.geetest.factory.abstractfactory;

/**
 * @author zhoubing
 * @date 2020-05-18 15:42
 */
public abstract class AbstractFactory {
    abstract Weapon getWeapon();

    abstract Food getFood();

    abstract Vehicle getVehicle();
}
