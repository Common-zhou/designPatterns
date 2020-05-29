package com.geetest.factory.abstractfactory2;

/**
 * @author zhoubing
 * @date 2020-05-29 21:23
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
