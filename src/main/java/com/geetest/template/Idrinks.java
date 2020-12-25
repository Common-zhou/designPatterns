package com.geetest.template;

/**
 * @author zhoubing
 * @date 2020-12-25 09:51
 */
public abstract class Idrinks {
    void boilWater() {
        System.out.println("烧一壶水......");
    }

    abstract void brew();

    void pourCup() {
        System.out.println("将水倒入......");
    }

    abstract void addComdiments();

    public void makeDrinks() {
        //烧水
        boilWater();
        // 加料
        brew();
        // 倒热水
        pourCup();
        // 加配料
        addComdiments();
    }
}
