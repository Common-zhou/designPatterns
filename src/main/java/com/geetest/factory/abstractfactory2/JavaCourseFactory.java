package com.geetest.factory.abstractfactory2;

/**
 * @author zhoubing
 * @date 2020-05-30 11:00
 */
public class JavaCourseFactory extends CourseFactory {
    class JavaVideo extends Video {
        @Override
        public void produce() {
            System.out.println("录制Java课程");
        }
    }

    class JavaArticle extends Article {
        @Override
        public void produce() {
            System.out.println("编写Java手记");
        }
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
