package com.geetest.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhoubing
 * @date 2020-05-18 11:53
 */
public class CatStrategy {
    public static void main(String[] args) {
        Cat cat1 = new Cat(12, 8);
        Cat cat2 = new Cat(11, 9);
        Cat cat3 = new Cat(10, 10);
        Cat cat4 = new Cat(9, 11);

        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4};

        System.out.println(Arrays.toString(cats));
        Arrays.sort(cats, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });
        System.out.println(Arrays.toString(cats));

    }
}
