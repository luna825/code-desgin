package cn.stack.design.right;

public class GuestVideoService implements IVideoService {
    @Override
    public void definition() {
        System.out.println("访客用户， 480P播放");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }
}
