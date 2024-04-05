package br.com.erudio.math;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void testSum() {
        // Arrange
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double expected = 8.2D;
        String message = firstNumber + " + " + secondNumber + " did not product " + expected;

        // Act
        Double current = math.sum(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, current, () -> message);
        assertNotEquals(9.2, current);
        assertNotNull(current);
    }


}