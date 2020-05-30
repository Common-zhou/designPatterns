package com.geetest.factory.abstractfactory2;

/**
 * @author zhoubing
 * @date 2020-05-30 10:58
 */
public interface CourseFactory {
    Article getArticle();

    Video getVideo();
}
