package com.geetest.factory.abstractfactory2;

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
