package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.exercise.Symmetry1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Symmetry1Test {
    @Test
    public void checkTrue() {
        boolean check = Symmetry1.check(1112111);
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse() {
        boolean check = Symmetry1.check(123456321);
        assertThat(check, is(false));
    }
}