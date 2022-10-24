package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySimpleTddTest {
    @Test
    void SumArrayTest(){
        assertEquals(15,ArraySimpleTdd.getSum(new int[]{1,2,3,4,5}));

    }
    @Test
    void minimumTest(){
        assertEquals(1,ArraySimpleTdd.getMinimum(new int[]{1,2,3,4,5}));

    }
    @Test
    void maximumTest(){
        assertEquals(5, ArraySimpleTdd.getMaximum(new int[]{1,2,3,4,5}));
    }
    @Test
    void MaxSumTest(){
        assertEquals(15, ArraySimpleTdd.getMaxSum(new int[]{1,2,3,4,5}));
    }
}