package cn.stack.desgin.right;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Slf4j
public class CashCard extends BankCard {

    public CashCard(String cardNo, LocalDateTime cardDate){
        super(cardNo, cardDate);
    }

    @Override
    boolean rule(BigDecimal amount) {
        return false;
    }

    public String withdrawal(String orderId, BigDecimal amount) {
        // 模拟支付成功
        log.info("提现成功，单号：{} 金额：{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    public String recharge(String orderId, BigDecimal amount) {
        // 模拟充值成功
        log.info("储蓄成功，单号：{} 金额：{}", orderId, amount);
        return super.positive(orderId, amount);
    }

    /**
     * 风险校验
     *
     * @param cardNo  卡号
     * @param orderId 单号
     * @param amount  金额
     * @return 状态
     */
    public boolean checkRisk(String cardNo, String orderId, BigDecimal amount) {
        // 模拟风控校验
        log.info("风控校验，卡号：{} 单号：{} 金额：{}", cardNo, orderId, amount);
        return true;
    }
}
