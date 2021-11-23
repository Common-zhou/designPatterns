package com.zhou.rule_02.lod.wrong;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhoubing
 * @date 2021-11-23 23:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private String name;
    private String clazz;
    private static List<Student> studentList;

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student("花花", 10, 589));
        studentList.add(new Student("豆豆", 54, 356));
        studentList.add(new Student("秋雅", 23, 439));
        studentList.add(new Student("皮皮", 2, 665));
        studentList.add(new Student("蛋蛋", 19, 502));
    }

    public static List<Student> getStudentList() {
        return studentList;
    }
}
