package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(11, 4, 2);
        assertThat(result, is(11));
    }

    @Test
    public void whenFirdMax() {
        int result = MultiMax.max(11, 4, 12);
        assertThat(result, is(12));
    }
}