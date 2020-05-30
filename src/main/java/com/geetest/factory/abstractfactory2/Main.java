package com.geetest.factory.abstractfactory2;

/**
 * @author zhoubing
 * @date 2020-05-30 11:03
 */
public class Main {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();

        Video video = javaCourseFactory.getVideo();
        Article article = javaCourseFactory.getArticle();

        video.produce();
        article.produce();

        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        Article article1 = pythonCourseFactory.getArticle();
        Video video1 = pythonCourseFactory.getVideo();
        article1.produce();
        video1.produce();

    }
}
