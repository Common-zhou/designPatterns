package com.geetest.builder;

/**
 * @author zhoubing
 * @date 2020-05-30 17:34
 */
public class Main {
    public static void main(String[] args) {
        Coach coach = new Coach();

        Course course = coach.makeCourse("Java设计模式精讲", "Java设计模式精讲视频", "Java设计模式精讲PPT",
                "Java设计模式精讲手记", "Java设计模式精讲QA");
        System.out.println(course);

    }
}
