package com.zhou.proxy;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/12/07 17:30
 */
public class Cat {
  private String name;
  private int age;


  public Cat(String name) {
    this.name = name;
  }

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void test() {
    System.out.println("test no parameter......");
  }

  public void test1(String name) {
    System.out.printf("test with parameter String: [name=%s]%n", name);
  }

  public void test1(String name, String aaa) {
    System.out.printf("test with parameter [String, String], [name=%s, age=%s]", name, aaa);
  }
}
