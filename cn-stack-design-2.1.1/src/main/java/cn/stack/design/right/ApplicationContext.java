package cn.stack.design.right;
/**
* ApplicationContext 单例类
 * spring 中可以用 configuration配置类
 * 负责 Alert创建， 依赖注入rule 和 notification 进行组装， 初始化handler
 *
 * 反回一个Alert的实例
* */
public class ApplicationContext {

    private AlertRule rule;

    private Notification notification;

    private Alert alert;

    public void initializeBeans() {
        rule = new AlertRule();
        notification = new Notification();
        alert = new Alert();
        alert.addHandler(new TpsAlertHandler(rule, notification));
        alert.addHandler(new ErrorAlertHandler(rule, notification));
    }

    public Alert getAlert(){
        return alert;
    }

    private ApplicationContext(){
        initializeBeans();
    }
    // 饿汉式单例
    private static final ApplicationContext instance = new ApplicationContext();

    public static ApplicationContext getInstance(){
        return instance;
    }

}
