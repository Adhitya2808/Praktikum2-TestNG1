package com.Tohsaka;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimaTest {
    private String hasil;

    @Test
    public void primaTest(){
        System.out.println("primaTest");
        String expected = "Bilangan Prima";
        String actual = Prima.prima(hasil);
        Assert.assertEquals(actual, expected);
    }
}