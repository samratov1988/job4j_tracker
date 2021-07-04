package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void area1() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void area2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        Point c = new Point(7, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(17.5, 0.001));
    }

    @Test
    public void area3() {
        Point a = new Point(2, 1);
        Point b = new Point(4, 5);
        Point c = new Point(6, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void area4() {
        Point a = new Point(1, 3);
        Point b = new Point(6, 5);
        Point c = new Point(6, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(10, 0.001));
    }
}