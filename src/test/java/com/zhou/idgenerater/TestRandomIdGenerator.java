package com.zhou.idgenerater;

import java.net.InetAddress;
import java.net.UnknownHostException;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

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

    static MockedStatic<InetAddress> inetAddressMockedStatic;

    @SneakyThrows
    @BeforeAll
    static void beforeEach() {

        InetAddress inetAddress = Mockito.mock(InetAddress.class);

        MockitoAnnotations.openMocks(TestRandomIdGenerator.class);
        inetAddressMockedStatic = Mockito.mockStatic(InetAddress.class);
        Mockito.when(InetAddress.getLocalHost()).thenReturn(inetAddress);
    }

    @AfterAll
    static void afterAll() {
        inetAddressMockedStatic.close();
    }


    private RandomIdGeneratorV2 randomIdGeneratorV2 = new RandomIdGeneratorV2();

    @Test
    public void testGenerateV2() throws UnknownHostException {
        Mockito.when(InetAddress.getLocalHost().getHostName()).thenReturn("test111");
        String hostLastSegmentByDot = randomIdGeneratorV2.getHostLastSegmentByDot();

        assert "test111".equals(hostLastSegmentByDot);

        Mockito.when(InetAddress.getLocalHost().getHostName()).thenReturn("zhouzhou.test111");
        hostLastSegmentByDot = randomIdGeneratorV2.getHostLastSegmentByDot();
        assert "test111".equals(hostLastSegmentByDot);

        Mockito.when(InetAddress.getLocalHost().getHostName()).thenReturn("zhouzhou#test111");
        hostLastSegmentByDot = randomIdGeneratorV2.getHostLastSegmentByDot();
        assert "zhouzhou#test111".equals(hostLastSegmentByDot);
    }

    @Test
    public void testGenerateV2Random() {
        String s = randomIdGeneratorV2.generateGivenLengthAlphabetRandom(8);
    }
}
