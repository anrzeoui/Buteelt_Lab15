package lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    @DisplayName("2 + 3 = 5")
    void add_simple() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    @DisplayName("Сөрөг тоонууд")
    void add_negative() {
        assertEquals(-1, calc.add(2, -3));
    }

    @Test
    void subtract_simple() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    void multiply_simple() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void divide_simple() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    @DisplayName("Тэгээр хуваах нь exception өгнө")
    void divide_byZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
    }
}
