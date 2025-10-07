package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

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
    void whenMax1To3Then3() {
        int left = 3;
        int middle = 2;
        int right = 1;
        int result = Max.max(left, middle, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To4Then4() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int result = Max.max(num1, num2, num3, num4);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

}