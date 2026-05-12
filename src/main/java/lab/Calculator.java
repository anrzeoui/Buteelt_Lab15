package lab;

/**
 * Энгийн calculator — Lab15-ийн starter код.
 *
 * Lec15-ийн (Trunk-based + CI/CD) практик дасгалд ашиглана.
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Тэгээр хуваах боломжгүй");
        }
        return a / b;
    }
}
