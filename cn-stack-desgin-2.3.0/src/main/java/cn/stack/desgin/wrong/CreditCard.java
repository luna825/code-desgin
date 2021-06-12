package cn.stack.desgin.wrong;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class CreditCard extends CashCard {

    @Override
    public String withdrawal(String orderId, BigDecimal amount) {
        if(amount.compareTo( new BigDecimal(1000)) >= 0){
            log.info("货款金额核验(限额1000) 单号：{} 金额： {}", orderId, amount);
            return "0001";
        }

        // 模拟生成贷款单
        log.info("生成贷款单，单号：{} 金额：{}", orderId, amount);
        // 模拟支付成功
        log.info("贷款成功，单号：{} 金额：{}", orderId, amount);
        return "0000";
    }

    @Override
    public String recharge(String orderId, BigDecimal amount) {
        // 模拟生成还款单
        log.info("生成还款单，单号：{} 金额：{}", orderId, amount);
        // 模拟还款成功
        log.info("还款成功，单号：{} 金额：{}", orderId, amount);
        return "0000";
    }
}
