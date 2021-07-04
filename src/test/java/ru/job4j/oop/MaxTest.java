package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax5To6Then6() {
        int first = 5;
        int second = 6;
        int result = Max.max(first, second);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To6To7Then7() {
        int first = 5;
        int second = 6;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void whenMax8To7To6To5Then8() {
        int first = 8;
        int second = 7;
        int third = 6;
        int fourth = 5;
        int result = Max.max(first, second, third, fourth);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }
}