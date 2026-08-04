package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}