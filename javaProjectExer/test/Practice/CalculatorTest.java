package Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator; // instance variable declaration

    @BeforeEach
    void startAllTestWith(){
        calculator = new Calculator();
    }

        @Test
        void testObjectExist(){
            assertNotNull(calculator);
        }
    @Test
    void sumTwoNum(){
        assertEquals(5, calculator.sumTwoNumber(3,2));


    }

    }


