package com.zhou.proxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2021/12/07 17:28
 */
public class TestReflect {
  @Test
  public void testReflect() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Class<Cat> catClass = Cat.class;
    System.out.println(catClass);
    Class<?>[] declaredClasses = catClass.getDeclaredClasses();
    for (Class<?> declaredClass : declaredClasses) {
      System.out.println(declaredClass);
    }

    Cat cat1 = new Cat("zhangsan");

    Method methodNoParameter = catClass.getMethod("test");
    methodNoParameter.invoke(cat1);

    Method method1WithOne = catClass.getMethod("test1", String.class);
    method1WithOne.invoke(cat1, "test1111");

  }
}
