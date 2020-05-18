package com.geetest.strategy;

/**
 * @author zhoubing
 * @date 2020-05-18 11:50
 */
public class Cat implements Comparable<Cat> {
    private int height;
    private int weight;

    public Cat() {
    }

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        if (height > o.height) {
            return 1;
        } else if (height < o.height) {
            return -1;
        } else {
            return 0;
        }
    }
}
