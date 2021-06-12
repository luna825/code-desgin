package cn.stack.design.wrong;

/**
 * 这样的代码存在很多的问题
 * 如果我们增加新的功能，比如超时的警告，就需要更改check函数
 *
 */
public class Alert {

    private AlertRule rule;
    private Notification notification;

    public void check(String api, long requestCount, long errorCount, long durationOfSeconds){
        long tps = requestCount / durationOfSeconds;
        if(rule.getMatchedRule(api).getMaxTps() < tps ){
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }

        if(errorCount > rule.getMatchedRule(api).getMaxErrorCount()){
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }


    /**

     * 现在，如果我们需要添加一个功能，当每秒钟接口超时请求个数，超过某个预先设置的最大阈值时，我们也要触发告警发送通知。这个时候，我们该如何改动代码呢？
     * 主要的改动有两处：第一处是修改 check() 函数的入参，添加一个新的统计数据 timeoutCount，表示超时接口请求数；
     *  第二处是在 check() 函数中添加新的告警逻辑。具体的代码改动如下所示：
     */
    // 改动一，添加入参
    public void check(String api, long requestCount, long errorCount, long durationOfSeconds, long timeoutCount){
        this.check(api, requestCount, errorCount, durationOfSeconds);

        //改动二 添加接口超时处理逻辑
        long timeoutTps = timeoutCount / durationOfSeconds;
        if(timeoutTps > rule.getMatchedRule(api).getMaxTimeoutTps()){
            notification.notify(NotificationEmergencyLevel.NORMAL, "...");
        }
    }
}
