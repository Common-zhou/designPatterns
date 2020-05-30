package com.geetest.builder;

/**
 * @author zhoubing
 * @date 2020-05-30 17:28
 */
public class Coach {
    private CourseBuilder courseBuilder = new CourseActualBuilder();

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String courseVideo,
                             String coursePPT, String courseArticle,
                             String courseQA) {
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseQA(courseQA);

        return courseBuilder.makeCourse();
    }
}
