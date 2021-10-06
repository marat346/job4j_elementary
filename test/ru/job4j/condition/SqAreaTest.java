package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.ratio(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K4Square256() {
        double expected = 2.56;
        int p = 8;
        double k = 4;
        double out = SqArea.ratio(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K6Square306() {
        double expected = 3.06;
        int p = 10;
        double k = 6;
        double out = SqArea.ratio(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }
}