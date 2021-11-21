package com.zhou.srp.right;

/**
 * @author zhoubing
 * @date 2021-11-21 23:59
 */
public class VipVideoUserService implements IVideoUserService{
    @Override
    public void definition() {
        System.out.println("VIP会员，1080P蓝光视频");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP会员，视频无广告");
    }
}
