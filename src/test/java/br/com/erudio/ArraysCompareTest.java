package br.com.erudio;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysCompareTest {

    @Test
    void test() {
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers = new int[]{10, 1, 8, 7, 6, 3, 4, 5, 2, 9};

        Arrays.sort(numbers);

        assertArrayEquals(numbers, expected);
    }

}
