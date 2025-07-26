package com.Tohsaka;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {
    private int a;
    private int b;

    @BeforeClass
    public void beforeClass() {
        a = 10;
        b = 2;
    }

    @Test
    public void addTest() {
        System.out.println("Calculator addTest");
        int expected = 12;
        int actual = Calculator.add(a,b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void substractedTest() {
        System.out.println("Calculator substractedTest");
        int expected = 8;
        int actual = Calculator.substract(a,b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void multiplicationTest() {
        System.out.println("Calculator multiplicationTest");
        int expected = 20;
        int actual = Calculator.multiply(a,b);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void divisionTest() {
        System.out.println("Calculator divisionTest");
        int expected = 5;
        int actual = Calculator.divide(a,b);
        Assert.assertEquals(actual,expected);
    }

    @AfterClass
    public void afterClass() {
        a = 0;
        b = 0;
    }
}
