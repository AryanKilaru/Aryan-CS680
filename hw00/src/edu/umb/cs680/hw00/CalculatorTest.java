package edu.umb.cs680.hw00;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void multiply7By3() {
        Calculator cut = new Calculator();
        float expected = 21;
        float actual = cut.multiply(7, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void divide9By4() {
        Calculator cut = new Calculator();
        float expected = 1.9f;
        float actual = cut.divide(9, 4);

        if(expected == actual){
            assertTrue(true);
            System.out.println("For test class divide9By4, Actual value = Expected value");
        }

        else{
            assertFalse(false);
            System.out.println("For test class divide9By4, Actual value != Expected value");
        }
    }

    @Test
    public void multiply6By8(){
        Calculator cut = new Calculator();
        float expected = 48;
        float actual = cut.multiply(6,8);
        assertTrue(cut instanceof Calculator);
        assertEquals(expected, actual);
    }


    @Test
    public void divide5By0withTryCatch() {
        Calculator cut = new Calculator();
        try {
            cut.divide(5, 0);
            fail("Division by zero");
        } catch (IllegalArgumentException ex) {
            assertEquals("division by zero", ex.getMessage());
        }
    }

}

