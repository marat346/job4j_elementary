package ru.job4j.condition;


import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void when23to75then5Dot39() {
        Point a = new Point(2, 3);
        Point b = new Point(7, 5);
        double result = a.distance(b);
        double expected = 5.38;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void when32to94then6Dot33() {
        Point a = new Point(3, 2);
        Point b = new Point(9, 4);
        double result = a.distance(b);
        double expected = 6.33;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void when000to111then1dot73() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        double result = a.distance(b);
        double expected = 1.41;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void when123to010then3dot31() {
        Point a = new Point(2, 3);
        Point b = new Point(0, 1);
        double result = a.distance(b);
        double expected = 2.82;
        Assert.assertEquals(expected, result, 0.01);
    }
}