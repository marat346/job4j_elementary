package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        int out = SqArea.ratio(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        int k = 1;
        int out = SqArea.ratio(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}


