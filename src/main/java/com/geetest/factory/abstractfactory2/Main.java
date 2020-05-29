package com.geetest.factory.abstractfactory2;

/**
 * @author zhoubing
 * @date 2020-05-29 21:23
 */
public class Main {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory2 = new PythonVideoFactory();

        Video video = videoFactory.getVideo();
        video.produce();

        Video video1 = videoFactory2.getVideo();
        video1.produce();

        VideoFactory videoFactory3 = new FeVideoFactory();
        Video video2 = videoFactory3.getVideo();
        video2.produce();

    }
}
