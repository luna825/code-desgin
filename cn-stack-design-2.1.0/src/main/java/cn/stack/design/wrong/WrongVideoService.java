package cn.stack.design.wrong;

public class WrongVideoService {

    public void serveGrade(String userType){
        if("VIP用户".equals(userType)){
            System.out.println("vip 用户，视频1080p");
        }else if("普通用户".equals(userType)){
            System.out.println("普通用户 720p");
        }else{
            System.out.println("访客用户，420P");
        }
    }
}
