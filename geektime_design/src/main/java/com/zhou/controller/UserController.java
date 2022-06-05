package com.zhou.controller;

import com.zhou.CusMetrics;
import com.zhou.model.UserVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author zhoubing
 * @since 2022/06/01 19:05
 */
@RestController
public class UserController {

  //private Metrics metrics = new Metrics();
  private CusMetrics metrics = new CusMetrics();

  public UserController() {
    System.out.println("user controller init =========");
    metrics.startRepeatedReport(10, TimeUnit.SECONDS);
  }

  @RequestMapping("register")
  public void register() {
    long startTimeStamp = System.currentTimeMillis();
    metrics.recordTimestamp("register", startTimeStamp);

    System.out.println("register==========");
    try {
      TimeUnit.MICROSECONDS.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    metrics.recordResponseTime("register",
        (double) (System.currentTimeMillis() - startTimeStamp));


  }

  @RequestMapping("login")
  public UserVo login(String telephone, String password) {
    UserVo userVo = new UserVo();
    userVo.setUserName("zhangsan");
    userVo.setPassword("password");


    long startTimeStamp = System.currentTimeMillis();
    metrics.recordTimestamp("login", startTimeStamp);

    System.out.println("login==========");
    try {
      TimeUnit.MICROSECONDS.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    metrics.recordResponseTime("login", (double) (System.currentTimeMillis() - startTimeStamp));

    return userVo;
  }
}
