package com.zhou.rule_02.strategy.filesort;

/**
 * 对文件排序的方法。
 * 0-10G 快速排序
 * 10-60 外部排序
 * 60-200 mapreduce排序
 *
 * @author zhoubing
 * @date 2021-12-05 22:45
 */
public interface ISortAlg {
    void sort(String filePath);
}
