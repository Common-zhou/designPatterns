package com.zhou;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2022/01/19 15:27
 */
public class TestRegx {
  private static final Pattern LEGAL_FILE_NAME =
      Pattern.compile("^[a-zA-Z0-9\u4e00-\u9fa5_. \\-\\[\\](){}\\uff08\\uff09\\u3010\\u3011]{1,150}$");

  public static void main(String[] args) {
    Matcher matcher = LEGAL_FILE_NAME.matcher("1111111.txt");
    System.out.println(matcher.find());
  }
}
