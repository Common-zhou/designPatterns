package com.geetest.factory.abstractfactory2;

/**
 * @author zhoubing
 * @date 2020-05-29 21:19
 */
public class PythonVideo implements Video {
    @Override
    public void produce() {
        System.out.println("录制python视频");
    }
}
