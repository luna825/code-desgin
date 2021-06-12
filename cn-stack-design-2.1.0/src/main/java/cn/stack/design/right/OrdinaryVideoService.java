package cn.stack.design.right;

public class OrdinaryVideoService implements IVideoService{
    @Override
    public void definition() {
        System.out.println("普通用户， 720P播放");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户，视频有广告");
    }
}
