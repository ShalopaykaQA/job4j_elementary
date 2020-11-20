package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void squareP4K1() {
        double expected = 1;
        double out = SqArea.square(4, 1);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void squareP6K2() {
        double expected = 2;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void squareP8K3() {
        double expected = 3;
        double out = SqArea.square(8, 3);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void squareP16K4() {
        double expected = 4;
        double out = SqArea.square(16, 4);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void squareP26K4() {
        double expected = 16;
        double out = SqArea.square(26, 4);
        Assert.assertEquals(expected, out, 0.01);

    }
}
