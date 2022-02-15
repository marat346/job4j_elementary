package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

        @Test
        public void whenMax3To1To2Then3() {
            int left = 2;
            int right = 1;
            int left1 = 3;
            int result = Max.max(left, right, left1);
            int expected = 3;
            Assert.assertEquals(result, expected);
        }

    @Test
    public void whenMax7To7Then7() {
        int left = 4;
        int right = 5;
        int left1 = 6;
        int right1 = 7;
        int result = Max.max(left, right, left1, right1);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}