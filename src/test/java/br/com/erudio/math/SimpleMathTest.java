package br.com.erudio.math;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
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
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
        fail();
    }


    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void subtractionTest() {
        // Arrange - Given
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double expected = 4.2D;
        String message = firstNumber + " - " + secondNumber + " did not product " + expected;

        // Act - When
        Double current = math.subtraction(firstNumber, secondNumber);

        // Assert - Then
        assertEquals(expected, current, () -> message);
    }

    @Test
    @DisplayName("Test 6.2 x 2 = 12.4")
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
    @DisplayName("Test 6 / 2 = 3")
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