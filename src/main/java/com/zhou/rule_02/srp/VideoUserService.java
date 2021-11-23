package com.zhou.rule_02.srp;

/**
 * 访客用户：480P视频 提醒注册观看高清
 * 普通用户：720P视频 不能屏蔽广告
 * VIP：1080P蓝光 可关闭和跳过广告
 *
 * @author zhoubing
 * @date 2021-11-21 23:45
 */
public class VideoUserService {
    public void serviceGrade(String userType) {
        if ("VIP会员".equals(userType)) {
            System.out.println("VIP会员，视频1080P蓝光");
        } else if ("普通会员".equals(userType)) {
            System.out.println("普通会员，视频720P超清");
        } else if ("访客用户".equals(userType)) {
            System.out.println("访客用户，视频480P高清");
        }
    }

}
