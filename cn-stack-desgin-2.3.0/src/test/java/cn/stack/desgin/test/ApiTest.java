package cn.stack.desgin.test;

import cn.stack.desgin.wrong.CashCard;
import cn.stack.desgin.wrong.CreditCard;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
public class ApiTest {

    @Test
    public void test_CashCard(){
        CashCard cashCard = new CashCard();
        cashCard.withdrawal("10001", new BigDecimal(100));
        cashCard.recharge("10001", new BigDecimal(100));
        List<String> tradeFlow = cashCard.tradeFlow();
        log.info("查询交易流水 {}", JSON.toJSONString(tradeFlow));
    }

    @Test
    public void test_CreditCard() {
        CreditCard creditCard = new CreditCard();
        // 支付
        creditCard.withdrawal("100001", new BigDecimal(100));
        // 还款
        creditCard.recharge("100001", new BigDecimal(100));
        // 交易流水
        List<String> tradeFlow = creditCard.tradeFlow();
        log.info("查询交易流水，{}", JSON.toJSONString(tradeFlow));
    }
}
