package com.zhou.rule_02.strategy.filesort;

import java.util.HashMap;

/**
 * @author zhoubing
 * @date 2021-12-05 23:04
 */
public class FileSortFactory {
    private final static long GB = 1000 * 1000 * 1000;

    private static HashMap<String, ISortAlg> fileSortAlgs = new HashMap<>();

    static {
        fileSortAlgs.put("quickSort", new QuickSortAlg());
        fileSortAlgs.put("external", new ExternalSortAlg());
        fileSortAlgs.put("mapreduce", new MapReduceSortAlg());
    }

    public static ISortAlg getSortAlg(long fileLength) {
        ISortAlg iSortAlg = null;
        if (fileLength < 6 * GB) {
            iSortAlg = fileSortAlgs.get("quickSort");
        } else if (fileLength < 10 * GB) {
            iSortAlg = fileSortAlgs.get("external");
        } else {
            iSortAlg = fileSortAlgs.get("mapreduce");
        }
        return iSortAlg;
    }
}
