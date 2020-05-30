package com.geetest.factory.factorymethod;

/**
 * @author zhoubing
 * @date 2020-05-29 21:31
 */
public class FeVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
