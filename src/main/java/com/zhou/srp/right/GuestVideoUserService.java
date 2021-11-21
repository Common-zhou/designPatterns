package com.zhou.srp.right;

/**
 * @author zhoubing
 * @date 2021-11-21 23:59
 */
public class GuestVideoUserService  implements IVideoUserService{
    @Override
    public void definition() {
        System.out.println("访客用户，480P高清视频");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }
}
