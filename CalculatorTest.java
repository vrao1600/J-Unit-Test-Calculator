package Calculator;

/** Import JUnit5 assertions for unit testing */
import static org.junit.jupiter.api.Assertions.*;
/** Import decorater from Tests */
import org.junit.jupiter.api.Test;
/** Import ArithmeticException for testing divide methods */
import java.lang.ArithmeticException;

/** CalculatorTest Class */
public class CalculatorTest { 
    // Define calculator objects
    Calculator c1 = new Calculator(2, 3);
    Calculator c2 = new Calculator(-2, 3);
    Calculator c3 = new Calculator(2, -3);
    Calculator c4 = new Calculator(-2, -3);
    Calculator c5 = new Calculator(0, 0);
    Calculator c6 = new Calculator(0, 3);
    Calculator c7 = new Calculator(2, 0);
    Calculator c8 = new Calculator(0, -3);
    Calculator c9 = new Calculator(-2, 0);
    Calculator c10 = new Calculator(50, 0);
    Calculator c11 = new Calculator(55, 11);

    @Test
    public void testAdd() {
        assertEquals(5, c1.add());
        assertEquals(1, c2.add());
        assertEquals(-1, c3.add());
        assertEquals(-5, c4.add());
        assertEquals(0, c5.add());
        assertEquals(3, c6.add());
        assertEquals(2, c7.add());
        assertEquals(-3, c8.add());
        assertEquals(-2, c9.add());
        assertEquals(50, c10.add());
        assertEquals(66, c11.add());
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, c1.subtract());
        assertEquals(-5, c2.subtract());
        assertEquals(5, c3.subtract());
        assertEquals(1, c4.subtract());
        assertEquals(0, c5.subtract());
        assertEquals(-3, c6.subtract());
        assertEquals(2, c7.subtract());
        assertEquals(3, c8.subtract());
        assertEquals(-2, c9.subtract());
    }

    @Test
    public void testMultiply() {
        assertEquals(6, c1.multiply());
        assertEquals(-6, c2.multiply());
        assertEquals(-6, c3.multiply());
        assertEquals(6, c4.multiply());
        assertEquals(0, c5.multiply());
        assertEquals(0, c6.multiply());
        assertEquals(0, c7.multiply());
        assertEquals(0, c8.multiply());
        assertEquals(0, c9.multiply());
    }

    @Test
    public void testDivide() {
        assertEquals(0, c1.divide());
        assertEquals(0, c2.divide());
        assertEquals(0, c3.divide());
        assertEquals(0, c4.divide());        

        
        // Test cases for division by zero
        assertThrows(ArithmeticException.class, () -> c5.divide());
        assertEquals(0, c6.divide());
        assertThrows(ArithmeticException.class, () -> c7.divide());
        assertEquals(0, c8.divide());
        assertThrows(ArithmeticException.class, () -> c9.divide());

        assertThrows(ArithmeticException.class, () -> c10.divide());
        assertEquals(5, c11.divide());

    }

}
