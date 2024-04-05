package br.com.erudio.math;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

    @Test
    void testSum() {
        // Arrange
        SimpleMath math = new SimpleMath();

        // Act
        Double result = math.sum(6.2D, 2D);

        // Assert
        Assertions.assertEquals(8.2D, result);
    }


}