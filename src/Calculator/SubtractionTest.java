package Calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sub() {
        assertEquals(12,Subtraction.sub(24,12));
    }
    @Test
    void sub1() {
        assertEquals(34,Subtraction.sub(24,-12));
    }
    @Test
    void sub2() {
        assertEquals(23,Subtraction.sub(24,1));
    }
    @Test
    void sub3() {
        assertEquals(40,Subtraction.sub(24,12));
    }
}