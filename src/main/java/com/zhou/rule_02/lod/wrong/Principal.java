package com.zhou.rule_02.lod.wrong;

import java.util.HashMap;
import java.util.Map;

/**
 * 迪米特法则 最接近的人 才说话
 * 其实本来应该是老师提供这些信息的。校长应该不用管这些
 *
 * @author zhoubing
 * @date 2021-11-23 23:13
 */
public class Principal {
  private Teacher teacher = new Teacher("李华", "三年级一班");

  public Map<String, Object> queryClazzInfo(String clazzId) {
    // 获取班级信息
    int stuCount = clazzStudentCount();

    double averageScore = clazzAverageScore();
    double totalScore = clazzTotalScore();
    Map<String, Object> clazzInfo = new HashMap<String, Object>();
    clazzInfo.put("班级", teacher.getClazz());
    clazzInfo.put("老师姓名", teacher.getName());
    clazzInfo.put("学生人数", stuCount);
    clazzInfo.put("总分", totalScore);
    clazzInfo.put("平均分", averageScore);
    return clazzInfo;
  }

  private int clazzStudentCount() {
    return teacher.getStudentList().size();
  }

  public double clazzAverageScore() {
    double totalScore = 0;
    for (Student stu : teacher.getStudentList()) {
      totalScore += stu.getGrade();
    }
    return totalScore / clazzStudentCount();
  }

  public double clazzTotalScore() {
    double totalScore = 0;
    for (Student stu : teacher.getStudentList()) {
      totalScore += stu.getGrade();
    }
    return totalScore;
  }

}
