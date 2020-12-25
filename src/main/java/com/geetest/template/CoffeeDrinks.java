package com.geetest.template;

/**
 * @author zhoubing
 * @date 2020-12-25 09:55
 */
public class CoffeeDrinks extends Idrinks {
    @Override
    void brew() {
        System.out.println("将咖啡粉倒入杯子......");
    }

    @Override
    void addComdiments() {
        System.out.println("加糖加奶......");
    }
}
