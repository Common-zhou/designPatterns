package com.zhou.rule_02.strategy.filesort;

/**
 * @author zhoubing
 * @date 2021-12-05 23:00
 */
public class ExternalSortAlg implements ISortAlg {

    @Override
    public void sort(String filePath) {
        System.out.println("外部排序");
    }
}
