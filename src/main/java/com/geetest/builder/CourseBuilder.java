package com.geetest.builder;

/**
 * @author zhoubing
 * @date 2020-05-30 17:20
 */
public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
