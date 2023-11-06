package com.chao.zhaotongxingzhe.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 超
 */
public class AlgorithmUtilsTest {

    @Test
    public void minDistance() {
        String str1 = "你好不好";
        String str2 = "我不好";
        int i = AlgorithmUtils.minDistance(str1, str2);
        System.out.println(i);
    }

    @Test
    public void testMinDistance() {
    }
}