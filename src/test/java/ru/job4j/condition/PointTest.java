package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus570then9Dot43() {
        double expected = 9.43;
        int x1 = -1;
        int y1 = -5;
        int x2 = 7;
        int y2 = 0;
        double output = Point.distance(-1, -5, 7, 0);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}