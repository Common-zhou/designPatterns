package com.zhou.rule_02.srp;

import com.zhou.rule_02.srp.right.GuestVideoUserService;
import com.zhou.rule_02.srp.right.IVideoUserService;
import com.zhou.rule_02.srp.right.OrdinaryVideoUserService;
import com.zhou.rule_02.srp.right.VipVideoUserService;
import org.junit.jupiter.api.Test;

/**
 * @author zhoubing
 * @date 2021-11-21 23:50
 */
public class TestServiceGrade {
    @Test
    public void testServeGrade(){
        VideoUserService service = new VideoUserService();
        service.serviceGrade("VIP会员");
        service.serviceGrade("普通会员");
        service.serviceGrade("访客用户");
    }

    @Test
    public void testRightImpl(){
        IVideoUserService service = new GuestVideoUserService();
        service.definition();
        service.advertisement();

        service = new OrdinaryVideoUserService();
        service.definition();
        service.advertisement();

        service = new VipVideoUserService();
        service.definition();
        service.advertisement();

    }
}
