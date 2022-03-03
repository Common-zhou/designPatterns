package com.zhou.jvm0104;


import java.io.IOException;
import java.util.Base64;

/**
 * base64 知识
 *
 * @author zhoubing
 * @since 2022/03/02 23:22
 */
public class CustomClassLoader extends ClassLoader {
  public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    // 这里要写全限定名
    // 可以使用base64直接对class进行编码
    Class<?> printHello = new CustomClassLoader().findClass("com.zhou.jvm0104.PrintHello");
    Object o = printHello.newInstance();
  }

  @Override
  protected Class<?> findClass(String name) throws ClassNotFoundException {
    String base64Content =
        "yv66vgAAADQAHAoABgAOCQAPABAIABEKABIAEwcAFAcAFQEABjxpbml0PgEAAygpVgEABENvZGUBAA9MaW5lTnVtYmVyVGFibGUBAAg8Y2xpbml0PgEAClNvdXJjZUZpbGUBAA9QcmludEhlbGxvLmphdmEMAAcACAcAFgwAFwAYAQAZVGhpcyBpcyBvbmx5IHByaW50IEhlbGxvIQcAGQwAGgAbAQAbY29tL3pob3UvanZtMDEwNC9QcmludEhlbGxvAQAQamF2YS9sYW5nL09iamVjdAEAEGphdmEvbGFuZy9TeXN0ZW0BAANvdXQBABVMamF2YS9pby9QcmludFN0cmVhbTsBABNqYXZhL2lvL1ByaW50U3RyZWFtAQAHcHJpbnRsbgEAFShMamF2YS9sYW5nL1N0cmluZzspVgAhAAUABgAAAAAAAgABAAcACAABAAkAAAAdAAEAAQAAAAUqtwABsQAAAAEACgAAAAYAAQAAAAoACAALAAgAAQAJAAAAJQACAAAAAAAJsgACEgO2AASxAAAAAQAKAAAACgACAAAADAAIAA0AAQAMAAAAAgAN";
    byte[] bytes = decode(base64Content);
    return defineClass(name, bytes, 0, bytes.length);
  }

  private byte[] decode(String base64Content) {
    return Base64.getDecoder().decode(base64Content);
  }

}
