package com.zhou.idgenerater;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 *     一个唯一id生成器
 *     这是初版实现
 * </pre>
 *
 * @author zhoubing
 * @date 2021-12-07 23:52
 */
@Slf4j
public class RandomIdGenerator {
    /**
     * 生成一个随机id，以用于全链路追踪
     * hostname - System.currentTimeMillis() - randomStr(8)
     *
     * @return
     */
    public static String generate() {
        String hostName = "";

        String generateStr = "";

        try {
            hostName = InetAddress.getLocalHost().getHostName();

            String[] split = hostName.split(".");
            if (split != null && split.length > 0) {
                // 取host的最后一部分
                hostName = split[split.length - 1];
            }

            long currentTimeMillis = System.currentTimeMillis();

            int count = 0;
            Random random = new Random();
            StringBuilder stringBuilder = new StringBuilder();
            while (count < 8) {
                int i = random.nextInt(122);
                if (i >= '0' && i <= '9') {
                    // 0-9
                    stringBuilder.append((char) i);
                    count++;
                } else if (i >= 'a' && i <= 'z') {
                    stringBuilder.append((char) i);
                    count++;
                } else if (i >= 'A' && i <= 'Z') {
                    stringBuilder.append((char) i);
                    count++;
                }
            }
            generateStr = String.format("%s-%s-%s", hostName, currentTimeMillis, stringBuilder);
        } catch (UnknownHostException e) {
            log.warn("unable get host.", e);
        }

        return generateStr;

    }
}
