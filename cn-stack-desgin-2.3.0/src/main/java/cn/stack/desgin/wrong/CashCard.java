package cn.stack.desgin.wrong;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CashCard {

    /**
     * 提现
     * */
    public String withdrawal(String orderId, BigDecimal amount){
        log.info("提现成功，单号：{} 金额 {}", orderId, amount);
        return "0000";
    }

    /**
     * 储蓄
     * */
    public String recharge(String orderId, BigDecimal amount){
        log.info("储蓄成功，单号：{} 金额 {}", orderId, amount);
        return "0000";
    }

    public List<String> tradeFlow(){
        log.info("交易流水查询成功");
        List<String> tradeList = new ArrayList<>();
        tradeList.add("10001, 100.00");
        tradeList.add("10002, 78.00");
        tradeList.add("10003, 46.00");
        tradeList.add("10004, 126.00");
        tradeList.add("10005, 50.00");
        return tradeList;
    }
}
