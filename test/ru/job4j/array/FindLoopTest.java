package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf1(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void thenArrayHas2Then2() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf2(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

}