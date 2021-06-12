package cn.stack.desgin.test;

import cn.stack.desgin.right.CashCard;
import cn.stack.desgin.right.CreditCard;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Slf4j
public class ApiRightTest {

    @Test
    public void test_bankCard() {
        log.info("里氏替换前，CashCard类：");
        CashCard bankCard = new CashCard("6214567800989876", LocalDateTime.now());
        // 提现
        bankCard.withdrawal("100001", new BigDecimal(100));
        // 储蓄
        bankCard.recharge("100001", new BigDecimal(100));

        log.info("里氏替换后，CreditCard类：");
        CashCard creditCard = new CreditCard("6214567800989876", LocalDateTime.now());
        // 提现
        creditCard.withdrawal("100001", new BigDecimal(1000000));
        // 储蓄
        creditCard.recharge("100001", new BigDecimal(100));
    }

    @Test
    public void test_CreditCard(){
        CreditCard creditCard = new CreditCard("6214567800989876", LocalDateTime.now());
        // 支付，贷款
        creditCard.loan("100001", new BigDecimal(100));
        // 还款
        creditCard.repayment("100001", new BigDecimal(100));
    }

}
