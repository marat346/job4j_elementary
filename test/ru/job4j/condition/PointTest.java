package ru.job4j.condition;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        a.distance(b);
        double expected = 2.0;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
    public void when23to75then5Dot39() {
        Point a = new Point(2, 3);
        Point b = new Point(7, 5);
        a.distance(b);
        double expected = 5.39;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
    public void when32to94then6Dot33() {
        Point a = new Point(3, 2);
        Point b = new Point(9, 4);
        a.distance(b);
        double expected = 6.33;
        assertThat(expected, is(a.distance(b)));
    }
}