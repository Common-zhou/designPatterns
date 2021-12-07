package com.zhou.idgenerater;

import org.junit.jupiter.api.Test;

/**
 * @author zhoubing
 * @date 2021-12-08 00:30
 */
public class TestRandomIdGenerator {
    @Test
    public void testGenerate() {
        String generate = RandomIdGenerator.generate();
        System.out.println(generate);
    }
}
