package com.zhou.rule_02.strategy;

import java.util.Comparator;

/**
 * @author zhoubing
 * @date 2021-12-05 14:27
 */
public class CatHeightSorter implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getHeight() < o2.getHeight()) {
            return -1;
        } else if (o1.getHeight() > o2.getHeight()) {
            return 1;
        }
        return 0;
    }
}
