package cn.stack.design.right;

public class TpsAlertHandler extends AlertHandler {

    public TpsAlertHandler(AlertRule rule, Notification notification){
        super(rule, notification);
    }

    @Override
    public void check(ApiStateInfo apiStateInfo) {
        long tps = apiStateInfo.getRequestCount() / apiStateInfo.getDurationOfSeconds();
        if( tps > rule.getMatchedRule(apiStateInfo.getApi()).getMaxTps()){
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}
