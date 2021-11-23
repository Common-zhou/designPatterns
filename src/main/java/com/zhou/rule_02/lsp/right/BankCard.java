package com.zhou.rule_02.lsp.right;

import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhoubing
 * @date 2021-11-23 00:29
 */
@Slf4j
public abstract class BankCard {
    // 卡号
    private String cardNo;
    // 开卡时间
    private String cardDate;

    public BankCard(String cardNo, String cardDate) {
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }

    public String positive(String orderId, BigDecimal amount){
        // 入款成功 存款、还款
        log.info("卡号{} 入账成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    public String negative(String orderId, BigDecimal amount){
        // 出账 借款、
        log.info("卡号{} 出账成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }
}
