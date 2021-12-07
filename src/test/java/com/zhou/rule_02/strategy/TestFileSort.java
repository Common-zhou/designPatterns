package com.zhou.rule_02.strategy;

import com.zhou.rule_02.strategy.filesort.FileSortFactory;
import com.zhou.rule_02.strategy.filesort.ISortAlg;
import java.io.File;
import org.junit.jupiter.api.Test;

/**
 * @author zhoubing
 * @date 2021-12-05 22:46
 */
public class TestFileSort {
    private final static long GB = 1000 * 1000 * 1000;

    /**
     * 就不单独写排序 的了  直接模拟一下
     */
    @Test
    public void testIf() {
        String filePath = "";

        File file = new File(filePath);
        long length = file.length();
        //length = 50 * GB;

        if (length < 6 * GB) {
            quickSort(filePath);
        } else if (length < 10 * GB) {
            externalSort(filePath);
        } else if (length < 100 * GB) {
            mapreduce(filePath);
        }

    }

    private void mapreduce(String filePath) {
        System.out.println("mapreduce 排序");
    }

    private void externalSort(String filePath) {
        System.out.println("外部排序");
    }

    private void quickSort(String filePath) {
        System.out.println("快速排序");
    }

    @Test
    public void testStrategy() {
        String filePath = "";

        File file = new File(filePath);
        long length = file.length();
        length = 8 * GB;

        //ISortAlg iSortAlg = null;
        //if (length < 6 * GB) {
        //    iSortAlg = new QuickSortAlg();
        //} else if (length < 10 * GB) {
        //    iSortAlg = new ExternalSortAlg();
        //} else {
        //    iSortAlg = new MapReduceSortAlg();
        //}

        ISortAlg iSortAlg = FileSortFactory.getSortAlg(length);
        iSortAlg.sort(filePath);
    }
}
