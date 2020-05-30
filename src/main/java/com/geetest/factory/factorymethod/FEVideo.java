package com.geetest.factory.factorymethod;

/**
 * @author zhoubing
 * @date 2020-05-29 21:26
 */
public class FEVideo implements Video {
    @Override
    public void produce() {
        System.out.println("录制前端课程");
    }
}
