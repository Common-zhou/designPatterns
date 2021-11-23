package com.zhou.rule_02.lsp.wrong;

import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhoubing
 * @date 2021-11-23 00:13
 */
@Slf4j
public class CreditCard  extends CashCard{
    @Override
    public String withdrawal(String orderId, BigDecimal amount) {
        //校验
        if (amount.compareTo(new BigDecimal(1000)) >= 0){
            log.info("贷款金额校验（限额1000元），单号：{} 金额：{}", orderId, amount);
            return Status.FAILURE.getCode();
        }
        log.info("生成贷款单，单号：{} 金额：{}", orderId, amount);
        log.info("贷款成功，单号：{} 金额：{}", orderId, amount);

        return Status.SUCCESS.getCode();

    }

    @Override
    public String recharge(String orderId, BigDecimal amount) {
        log.info("生成还款单，单号：{} 金额：{}", orderId, amount);
        log.info("还款成功，单号：{} 金额：{}", orderId, amount);

        return Status.SUCCESS.getCode();
    }
}
