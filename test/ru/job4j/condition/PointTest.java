package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceX2is2() {
        double expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceX1is6X2is2() {
        double expected = 4;
        double out = Point.distance(6, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceY1is9() {
        double expected = 9;
        double out = Point.distance(0, 9, 0, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceY1is9Y2is7() {
        double expected = 2;
        double out = Point.distance(0, 9, 0, 7);
        Assert.assertEquals(expected, out, 0.01);
    }
}