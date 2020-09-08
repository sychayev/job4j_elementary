package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DefragmentTest {

    @Test
    public void singleFirstNull() {
        String[] input = {"I", null};
        String[] compressed = Defragment.compress(input);
        String[] expect = {"I", null};
        assertThat(compressed, is(expect));
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expect = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expect));
    }

    @Test
    public void firstNull() {
        String[] input = {null, null, null};
        String[] compressed = Defragment.compress(input);
        String[] expect = {null, null, null};
        assertThat(compressed, is(expect));
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expect = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expect));
    }
}