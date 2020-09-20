package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max() {
        int rsl = Max.max(10,5);
        assertThat(rsl,is(10));
    }

    @Test
    public void testMax() {
        int rsl = Max.max(1,5,2);
        assertThat(rsl,is(5));
    }

    @Test
    public void testMax1() {
        int rsl = Max.max(10,5,3,11);
        assertThat(rsl,is(11));
    }
}