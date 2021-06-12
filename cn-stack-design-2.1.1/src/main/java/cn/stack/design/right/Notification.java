package cn.stack.design.right;

public class Notification {

    public void notify(NotificationEmergencyLevel level, String message){
        System.out.println(level.toString() + message);
    }
}
