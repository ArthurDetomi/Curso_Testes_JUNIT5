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


    @Test
    void subtractionTest() {
        // Arrange
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double expected = 4.2D;
        String message = firstNumber + " - " + secondNumber + " did not product " + expected;

        // Act
        Double current = math.subtraction(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, current, () -> message);
    }

    @Test
    void multiplicationTest() {
        // Arrange
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double expected = 12.4D;
        String message = firstNumber + " x " + secondNumber + " did not product " + expected;

        // Act
        Double current = math.multiplication(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, current, () -> message);
    }

    @Test
    void divisionTest() {
        // Arrange
        SimpleMath math = new SimpleMath();
        double firstNumber = 6D;
        double secondNumber = 2D;
        Double expected = 3D;
        String message = firstNumber + " / " + secondNumber + " did not product " + expected;

        // Act
        Double current = math.division(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, current, () -> message);
    }

    @Test
    void meanTest() {
        // Arrange
        SimpleMath math = new SimpleMath();
        double firstNumber = 9D;
        double secondNumber = 3D;
        Double expected = 6D;
        String message = firstNumber + " mean " + secondNumber + " did not product " + expected;

        // Act
        Double current = math.mean(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, current, () -> message);
    }

    @Test
    void squareRootTest() {
        // Arrange
        SimpleMath math = new SimpleMath();
        double number = 9D;
        Double expected = 3D;
        String message = number + " square root " + " did not product " + expected;

        // Act
        Double current = math.squareRoot(number);

        // Assert
        assertEquals(expected, current, () -> message);
    }
}