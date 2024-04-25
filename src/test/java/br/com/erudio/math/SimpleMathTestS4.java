package br.com.erudio.math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleMathTestS4 {
    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        System.out.println("Running @BeforeEach method!");
        math = new SimpleMath();
    }

    @DisplayName("Test Division")
    @ParameterizedTest
        //@MethodSource("testDivisionInputParameters")Não é necessário acrescentar nome se os nomes dos metodos forem o mesmo
    @CsvSource({
            "6.2, 2, 3.1",
            "10, 2, 5",
            "18, 3, 6"
    })
    void testDivision(double firstNumber, double secondNumber, double expectedResult) {
        // Arrange
        String message = firstNumber + " / " + secondNumber + " did not product " + expectedResult;

        // Act
        Double current = math.division(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, current, () -> message);
    }

    /*
    public static Stream<Arguments> testDivisionInputParameters() {
        return Stream.of(
                Arguments.of(6.2D, 2D, 3.1D),
                Arguments.of(10D, 2D, 5D),
                Arguments.of(18D, 3D, 6D)
        );
    }
    */
}
