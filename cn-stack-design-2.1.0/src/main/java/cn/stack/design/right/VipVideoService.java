package cn.stack.design.right;

public class VipVideoService implements IVideoService{
    @Override
    public void definition() {
        System.out.println("VIP用户， 1080P播放");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP用户，视频无广告");
    }
}
