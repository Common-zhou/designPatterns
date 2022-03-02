package com.zhou;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2022/02/08 10:58
 */
public class TestStream {
  public static void main(String[] args) {
    List<String> test = new ArrayList<>();
    test.add("ccc");
    test.add("bbb");
    test.add("aaa");

    List<String> res = test.stream().filter(str -> {
      if ("aaa".equals(str)) {
        throw new RuntimeException("test");
      }
      System.out.println(str);
      return true;
    }).collect(Collectors.toList());
    System.out.println(res);
  }
}
