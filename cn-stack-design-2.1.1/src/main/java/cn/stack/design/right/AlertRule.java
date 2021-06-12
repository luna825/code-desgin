package cn.stack.design.right;

/**
 * 警告的规则，可以自由设置
 * 可以将规则设置在配置文件中,如
 *  " api: maxErrorCount = 100 && maxTps = 30 && maxTimeoutTps = 100 "
 *
 * */
public class AlertRule {

    public MatchedRule getMatchedRule(String api){
        return new MatchedRule();
    }


    public static class MatchedRule {
        int maxErrorCount = 10;
        int maxTps = 30;
        int maxTimeoutTps = 500;

        public int getMaxErrorCount() {
            return maxErrorCount;
        }

        public void setMaxErrorCount(int maxErrorCount) {
            this.maxErrorCount = maxErrorCount;
        }

        public int getMaxTps() {
            return maxTps;
        }

        public void setMaxTps(int maxTps) {
            this.maxTps = maxTps;
        }

        public int getMaxTimeoutTps() {
            return maxTimeoutTps;
        }

        public void setMaxTimeoutTps(int maxTimeoutTps) {
            this.maxTimeoutTps = maxTimeoutTps;
        }
    }
}
