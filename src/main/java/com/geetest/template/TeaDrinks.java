package com.geetest.template;

/**
 * @author zhoubing
 * @date 2020-12-25 10:01
 */
public class TeaDrinks extends Idrinks {
    @Override
    void brew() {
        System.out.println("加入茶叶......");
    }

    @Override
    void addComdiments() {
        System.out.println("加入柠檬片......");
    }
}
