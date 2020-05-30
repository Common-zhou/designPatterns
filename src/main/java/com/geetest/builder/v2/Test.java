package com.geetest.builder.v2;

/**
 * @author zhoubing
 * @date 2020-05-30 19:08
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("Java设计模式精讲")
                .buildCourseArticle("Java设计模式精讲手记")
                .buildCourseVideo("Java设计模式精讲视频")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseQA("Java设计模式精讲问答")
                .build();

        System.out.println(course);
    }
}
