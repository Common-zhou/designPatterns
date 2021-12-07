package com.zhou.rule_02.strategy;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * @author zhoubing
 * @date 2021-12-05 14:28
 */
public class TestNormalSorter {
    @Test
    public void sortInteger() {
        Integer[] datas = new Integer[] {1, 3, 8, 2, 5, 6, 9};
        NormalSorter<Integer> normalSorter = new NormalSorter<>();

        normalSorter.sort(datas, (o1, o2) -> {
            if (o1 > o2) {
                return 1;
            } else if (o1 < o2) {
                return -1;
            }
            return 0;
        });

        System.out.println(Arrays.toString(datas));

    }

    @Test
    public void testSortCat() {
        Cat[] cats = {new Cat(1, 1), new Cat(6, 6), new Cat(9, 9), new Cat(3, 3)};

        NormalSorter<Cat> normalSorter = new NormalSorter<>();
        normalSorter.sort(cats, new CatHeightSorter());

        System.out.println(Arrays.toString(cats));
    }
}
