package br.com.erudio.math;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {

    SimpleMath math;

    @BeforeAll
    static void setUp() {
        System.out.println("Running @BeforeAll method!");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll method!");
    }

    @BeforeEach
    void beforeEachMethod() {
        System.out.println("Running @BeforeEach method!");
        math = new SimpleMath();
    }

    @AfterEach
    void afterEachMethod() {
        System.out.println("Running @AfterEach method!");
    }

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {

        System.out.println("Test 6.2 + 2 = 8.2");
        // Arrange
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
        System.out.println("first number is divided by zero");
        // Arrange
        double firstNumber = 6.2D;
        String expected = "Não existe divisão por 0!";

        // Act
        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class,
                () -> math.division(firstNumber, 0D));

        // Assert
        assertEquals(expected, arithmeticException.getMessage());
    }


    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void subtractionTest() {
        System.out.println("Test 6.2 - 2 = 4.2");
        // Arrange - Given
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
        System.out.println("Test 6.2 x 2 = 12.4");
        // Arrange
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
        System.out.println("Test 6 / 2 = 3");
        // Arrange
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
        System.out.println("Test mean");
        // Arrange
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
        System.out.println("Test squareRoot of 6.2 = 8.2");
        // Arrange
        double number = 9D;
        Double expected = 3D;
        String message = number + " square root " + " did not product " + expected;

        // Act
        Double current = math.squareRoot(number);

        // Assert
        assertEquals(expected, current, () -> message);
    }
}