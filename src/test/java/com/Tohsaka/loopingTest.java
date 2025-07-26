package com.Tohsaka;

import org.testng.Assert;
import org.testng.annotations.Test;

public class loopingTest {
    private int a;

    @Test
    public void test1() {
        int expected = 1000;
        int actual = looping.looping(a);
        Assert.assertEquals(actual, expected);
    }
}
