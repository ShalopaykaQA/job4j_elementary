package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax88To77Then88() {
        int result = Max.max(88, 77);
        assertThat(result, is(88));
    }
}