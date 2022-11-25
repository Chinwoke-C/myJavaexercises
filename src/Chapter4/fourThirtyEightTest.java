package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class fourThirtyEightTest {
    @BeforeEach
    public void setUp(){

    }
    @Test
    public void getFactorial(){
        int factorial = fourThirtyEight.factorial(5);
        assertEquals(120,factorial);
    }

}
