package com.zhou.rule_02.lsp.wrong;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * 储蓄卡的功能实现中 包括三个方法：提现、储蓄、交易流水查询
 * @author zhoubing
 * @date 2021-11-22 23:42
 */
@Slf4j
public class CashCard {

    public enum Status {
        SUCCESS("0000", "成功"),
        FAILURE("0000", "成功"),
        REPEAT("0000", "成功");

        private String code;
        private String name;

        Status(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }
    }


    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码 0000成功、0001失败 0002 重复
     */
    public String withdrawal(String orderId, BigDecimal amount) {
        // 模拟支付成功
        log.info("提现成功，单号：{} 金额{}", orderId, amount);
        return Status.SUCCESS.code;
    }

    /**
     * 储蓄
     * @param orderId 单号
     * @param amount 金额
     */
    public String recharge(String orderId, BigDecimal amount) {
        log.info("储蓄成功，单号：{} 金额：{}", orderId, amount);
        return Status.SUCCESS.code;
    }

    /**
     * 交易流水查询
     * @return 交易流水
     */
    public List<String> tradeFlow(){
        log.info("交易流水查询成功");
        List<String> tradeList = new ArrayList<>();
        tradeList.add("10001,100.00");
        tradeList.add("10001,80.00");
        tradeList.add("10001,60.00");
        tradeList.add("10001,76.50");
        tradeList.add("10001,126.00");
        return tradeList;
    }

}
