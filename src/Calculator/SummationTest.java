package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummationTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    void sum() {
        assertEquals(51,Summation.sum(-20,-30));
    }

    @Test
    void sum1() {
        assertEquals(-21,Summation.sum(-24,3));

    }
    @Test
    void sum2() {
        assertEquals(32,Summation.sum(25,-7));

    }
    @Test
    void sum3() {
        assertEquals(5,Summation.sum(5,3));

    }
}