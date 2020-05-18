package com.geetest.strategy;

import java.util.Arrays;

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

        System.out.println("原始的猫组合");
        System.out.println(Arrays.toString(cats));
        Arrays.sort(cats, new CatHeightComparator());
        System.out.println("按照高度比较，从小到大");
        System.out.println(Arrays.toString(cats));

        Arrays.sort(cats, new CatWeightComparator());
        System.out.println("按照重量比较，从小到大");
        System.out.println(Arrays.toString(cats));

    }
}
