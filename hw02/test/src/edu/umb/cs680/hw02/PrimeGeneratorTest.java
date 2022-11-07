package edu.umb.cs680.hw02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeGeneratorTest {

    @Test
    public void generatePrime() {
        PrimeGenerator gen = new PrimeGenerator(1,10);
        gen.generatePrimes();
        Long[] expectedPrimes = {2L, 3L, 5L, 7L};
        assertArrayEquals(expectedPrimes, gen.getPrimes().toArray());
    }

    @Test
    public void NegativeRangeNumber() {
        try {
            PrimeGenerator gen = new PrimeGenerator(-10, 10);
            gen.generatePrimes();
        } catch (RuntimeException ex) {
            assertEquals("Wrong input values: from=-10 to=10", ex.getMessage());
        }
    }

    @Test
    public void primeFrom12To2() {
        try {
            PrimeGenerator pGenerator = new PrimeGenerator(12L, 2L);
            pGenerator.generatePrimes();
            pGenerator.getPrimes();
            fail("Invalid range test fail");
        } catch (RuntimeException ex) {
            assertEquals("Wrong input values: from=12 to=2", ex.getMessage());
        }
    }
}