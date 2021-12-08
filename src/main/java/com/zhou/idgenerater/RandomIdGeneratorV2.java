package com.zhou.idgenerater;

import com.google.common.annotations.VisibleForTesting;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 *     一个唯一id生成器
 *     这是重构后的版本
 * </pre>
 *
 * @author zhoubing
 * @date 2021-12-07 23:52
 */
@Slf4j
public class RandomIdGeneratorV2 {
    /**
     * 生成一个随机id，以用于全链路追踪
     * hostname - System.currentTimeMillis() - randomStr(8)
     *
     * @return
     */
    public String generate() {

        String generateStr = "";

        try {
            String hostNameLastPartByDot = getHostLastSegmentByDot();

            long currentTimeMillis = System.currentTimeMillis();

            String randomAlphabet = generateGivenLengthAlphabetRandom(8);

            generateStr = String.format("%s-%s-%s", hostNameLastPartByDot, currentTimeMillis, randomAlphabet);
        } catch (UnknownHostException e) {
            log.warn("unable get host.", e);
        }

        return generateStr;

    }

    @VisibleForTesting
    public String generateGivenLengthAlphabetRandom(int length) {

        int count = 0;
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        while (count < length) {
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

        return stringBuilder.toString();
    }

    @VisibleForTesting
    protected String getHostLastSegmentByDot() throws UnknownHostException {
        String hostName = InetAddress.getLocalHost().getHostName();

        String[] split = hostName.split("\\.");
        if (split != null && split.length > 0) {
            // 取host的最后一部分
            hostName = split[split.length - 1];
        }
        return hostName;
    }
}
