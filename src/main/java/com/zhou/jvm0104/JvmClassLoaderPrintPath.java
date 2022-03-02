package com.zhou.jvm0104;

import com.google.common.collect.Lists;
import sun.misc.Launcher;

import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2022/03/02 00:12
 */
public class JvmClassLoaderPrintPath {
  public static void main(String[] args) {
    URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
    System.out.println("启动类加载器");
    for (URL urL : urLs) {
      System.out.println(urL.toExternalForm());
    }

    printClassLoader("扩展类加载器", JvmClassLoaderPrintPath.class.getClassLoader().getParent());
    printClassLoader("应用类加载器", JvmClassLoaderPrintPath.class.getClassLoader());
  }

  public static void printClassLoader(String name, ClassLoader classLoader) {
    if (classLoader != null) {
      System.out.println(name + " ClassLoader ->" + classLoader.toString());
      printClassForClassLoader(classLoader);
    } else {
      System.out.println(name + " ClassLoader -> null");
    }
  }

  private static void printClassForClassLoader(ClassLoader classLoader) {
    Object ucp = insightField(classLoader, "ucp");
    Object path = insightField(ucp, "path");
    ArrayList ps = (ArrayList) path;
    for (Object p : ps) {
      System.out.println(" ==> " + p.toString());
    }
  }

  private static Object insightField(Object obj, String fName) {
    Field f = null;
    try {

      if (obj instanceof URLClassLoader) {
        f = URLClassLoader.class.getDeclaredField(fName);
      } else {
        f = obj.getClass().getDeclaredField(fName);
      }
      f.setAccessible(true);
      return f.get(obj);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return Lists.newArrayList();
  }
}
