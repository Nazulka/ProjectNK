package problems.solutions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        Calculator calc = new Calculator();
        int result = calc.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Add with zero")
    void addZero() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 0);
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Add with negative numbers")
    void addNegative() {
        Calculator calc = new Calculator();
        int result = calc.add(-3, -11);
        assertEquals(-14, result);

    }
}
