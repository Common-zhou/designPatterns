package com.zhou.rule_02.strategy.filesort;

/**
 * @author zhoubing
 * @date 2021-12-05 23:01
 */
public class MapReduceSortAlg implements ISortAlg {
    @Override
    public void sort(String filePath) {
        System.out.println("mapreduce 排序");
    }
}
