package com.zhou.rule_02.strategy;

import java.util.Comparator;

/**
 * @author zhoubing
 * @date 2021-12-05 14:25
 */
public class NormalSorter<T> {
    public void sort(T[] datas, Comparator<T> comparator) {
        for (int i = 0; i < datas.length; i++) {
            // 找到最小的
            int minValIndex = i;
            for (int j = i + 1; j < datas.length; j++) {
                if (comparator.compare(datas[j], datas[minValIndex]) < 0) {
                    minValIndex = j;
                }
            }

            // 找到了最小的位置
            swap(datas, i, minValIndex);
        }
    }

    private void swap(T[] datas, int left, int right) {
        T tmp = datas[left];
        datas[left] = datas[right];
        datas[right] = tmp;
    }
}
