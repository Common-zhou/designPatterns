package com.zhou.rule_02.strategy;

/**
 * 排序 可以对数字进行排序
 *
 * @author zhoubing
 * @date 2021-12-05 13:17
 */
public class Sorter {
    public void sort(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            // 找到最小的
            int minValIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minValIndex]) < 0) {
                    minValIndex = j;
                }
            }

            // 找到了最小的位置
            swap(array, i, minValIndex);
        }
    }

    private void swap(Comparable[] array, int left, int right) {
        Comparable tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
