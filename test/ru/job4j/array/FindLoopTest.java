package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int data[] = {5, 4, 3, 2};
        int el = 5;
        int rst = FindLoop.indexOf(data, el);
        int expect = 0;
        assertThat(rst, is(expect));

    }

    @Test
    public void whenArrayHas3Then2() {
        int data[] = {5, 4, 3, 2};
        int el = 3;
        int rst = FindLoop.indexOf(data, el);
        int expect = 2;
        assertThat(rst, is(expect));

    }

    @Test
    public void whenArrayHas1ThenNone() {
        int data[] = {5, 4, 3, 2};
        int el = 1;
        int rst = FindLoop.indexOf(data, el);
        int expect = -1;
        assertThat(rst, is(expect));

    }
}