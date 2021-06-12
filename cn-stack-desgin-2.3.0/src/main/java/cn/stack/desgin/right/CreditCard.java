package cn.stack.desgin.right;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Slf4j
public class CreditCard extends CashCard {

    public CreditCard(String cardNo, LocalDateTime cardDate){
        super(cardNo, cardDate);
    }

    boolean rule2(BigDecimal amount){
        return amount.compareTo(new BigDecimal(1000)) <= 0;
    }

    /**
     * 提现，信用卡贷款
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码
     */
    public String loan(String orderId, BigDecimal amount) {
        boolean rule = rule2(amount);
        if (!rule) {
            log.info("生成贷款单失败，金额超限。单号：{} 金额：{}", orderId, amount);
            return "0001";
        }
        // 模拟生成贷款单
        log.info("生成贷款单，单号：{} 金额：{}", orderId, amount);
        // 模拟支付成功
        log.info("贷款成功，单号：{} 金额：{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    /**
     * 还款，信用卡还款
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码
     */
    public String repayment(String orderId, BigDecimal amount) {
        // 模拟生成还款单
        log.info("生成还款单，单号：{} 金额：{}", orderId, amount);
        // 模拟还款成功
        log.info("还款成功，单号：{} 金额：{}", orderId, amount);
        return super.positive(orderId, amount);
    }
}
