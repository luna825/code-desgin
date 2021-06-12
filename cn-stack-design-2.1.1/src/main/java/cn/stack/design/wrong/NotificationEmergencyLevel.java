package cn.stack.design.wrong;

/**
 * 通知的紧急程度，SEVERE(严重), URGENCY（紧急）, NORMAL（普通），不同程度的对应不同的发送渠道
 * */
public enum NotificationEmergencyLevel {
    URGENCY,
    SEVERE,
    NORMAL
}
