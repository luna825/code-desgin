package cn.stack.design.test;

import cn.stack.design.right.GuestVideoService;
import cn.stack.design.right.IVideoService;
import cn.stack.design.right.OrdinaryVideoService;
import cn.stack.design.right.VipVideoService;
import cn.stack.design.wrong.WrongVideoService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_serveGrade(){
        WrongVideoService service = new WrongVideoService();
        service.serveGrade("VIP用户");
        service.serveGrade("普通用户");
        service.serveGrade("访客用户");
    }

    @Test
    public void test_right_videoService(){


        IVideoService guest = new GuestVideoService();
        guest.definition();
        guest.advertisement();

        IVideoService ordinary = new OrdinaryVideoService();
        ordinary.definition();
        ordinary.advertisement();

        IVideoService vip = new VipVideoService();
        vip.definition();
        vip.advertisement();

    }
}
