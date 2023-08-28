package com.zhou.proxy_dynamic;

/**
 * @author Common-zhou
 * @since 2023-08-28 15:12
 */
public interface IRentHouse {

    /**
     * 租房接口，传入钱，返回是否租到
     *
     * @param money 钱
     * @return 是否租到
     */
    boolean rent(Integer money);
}
