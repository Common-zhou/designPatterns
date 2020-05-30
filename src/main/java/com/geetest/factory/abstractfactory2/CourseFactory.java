package com.geetest.factory.abstractfactory2;

/**
 * @author zhoubing
 * @date 2020-05-30 10:58
 */
public abstract class CourseFactory {
    abstract Article getArticle();

    abstract Video getVideo();
}
