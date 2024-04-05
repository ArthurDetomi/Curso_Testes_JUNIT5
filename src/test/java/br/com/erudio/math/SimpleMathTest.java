package br.com.erudio.math;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void testSum() {
        // Arrange
        SimpleMath math = new SimpleMath();

        // Act
        Double current = math.sum(6.2D, 2D);
        Double expected = 8.2D;

        // Assert
        assertEquals(expected, current, "6.2 + 2 did not product 8.2");
        assertNotEquals(9.2, current);
        assertNotNull(current);
    }


}