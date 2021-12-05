package com.zhou.rule_02.strategy;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

/**
 * @author zhoubing
 * @date 2021-12-05 13:23
 */
public class TestSorter {

    @Spy
    Sorter sorter =new Sorter();

    @Test
    public void testSorterArray() {
        //Sorter sorter = new Sorter();
        Integer[] array = {6, 3, 6, 1, 5, 9, 7, 8};
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testSortCat() {
        Cat[] cats = {new Cat(1, 1), new Cat(6, 6), new Cat(3, 3), new Cat(5, 5)};

        sorter.sort(cats);
        System.out.println(Arrays.toString(cats));
    }
}
