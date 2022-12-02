package Chapter2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComparingTest {
    Comparing compare = new Comparing();

    @Test
    public void numberCanSquareItSelf(){
        compare.square(5);
        assertEquals(25,compare.square(5));
    }
    @Test
    public void compareNumberAndItsSquareGreaterThan100Test(){
       assertTrue(compare.compareNumberAndSquareGreaterThan100(10));
    }
//    @Test
//    public void
}
