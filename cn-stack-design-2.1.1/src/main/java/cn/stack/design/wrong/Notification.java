package cn.stack.design.wrong;

public class Notification {

    public void notify(NotificationEmergencyLevel level, String message){
        System.out.println(level.toString() + message);
    }
}
