package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance3d1() {
        Point a = new Point(0, 0,0);
        Point b = new Point(3, 3, 3);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(5.196, 0.001));
    }

    @Test
    public void distance3d2() {
        Point a = new Point(1, 2,3);
        Point b = new Point(4, 5, 6);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(5.196, 0.001));
    }

    @Test
    public void distance3d3() {
        Point a = new Point(2, 2,2);
        Point b = new Point(10, 15, 15);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(20.05, 0.001));
    }
}