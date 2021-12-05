package com.zhou.rule_02.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhoubing
 * @date 2021-12-05 13:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat implements Comparable<Cat> {
    private int weight;
    private int height;

    @Override
    public int compareTo(Cat o) {
        if (this.weight > o.weight) {
            return 1;
        } else if (this.weight < o.weight) {
            return -1;
        }
        return 0;
    }
}
