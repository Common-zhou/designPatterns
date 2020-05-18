package com.geetest.factory.abstractfactory;

/**
 * @author zhoubing
 * @date 2020-05-18 15:51
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Weapon getWeapon() {
        return new MagicStick();
    }

    @Override
    Food getFood() {
        return new MushRoom();
    }

    @Override
    Vehicle getVehicle() {
        return new Broom();
    }
}
