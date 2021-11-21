package com.zhou.srp.right;

/**
 * @author zhoubing
 * @date 2021-11-21 23:59
 */
public class OrdinaryVideoUserService implements IVideoUserService{
    @Override
    public void definition() {
        System.out.println("普通会员，720P超清视频");
    }

    @Override
    public void advertisement() {
        System.out.println("普通会员，视频有广告");
    }
}
