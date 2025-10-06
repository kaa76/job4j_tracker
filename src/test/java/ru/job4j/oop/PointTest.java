package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when00to03then3() {
        double expected = 3;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 3);
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus10to00then1() {
        double expected = 1;
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(0, 0);
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus12to00then2Dot24() {
        double expected = 2.24;
        Point point1 = new Point(-1, 2);
        Point point2 = new Point(0, 0);
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}