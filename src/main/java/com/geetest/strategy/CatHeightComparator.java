package com.geetest.strategy;

import java.util.Comparator;

/**
 * @author zhoubing
 * @date 2020-05-18 13:55
 */
public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getHeight() - o2.getHeight();
    }
}
