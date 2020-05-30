package com.geetest.factory.abstractfactory2;

/**
 * @author zhoubing
 * @date 2020-05-30 11:02
 */
public class PythonCourseFactory implements CourseFactory {

    class PythonVideo implements Video {
        @Override
        public void produce() {
            System.out.println("录制python视频");
        }
    }

    class PythonArticle implements Article {
        @Override
        public void produce() {
            System.out.println("编写python手记");
        }
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
