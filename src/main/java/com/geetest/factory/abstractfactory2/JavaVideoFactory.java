package com.geetest.factory.abstractfactory2;

/**
 * @author zhoubing
 * @date 2020-05-29 21:21
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
