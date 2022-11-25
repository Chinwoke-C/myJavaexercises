package YetAnotherWeekend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestTest {
@Test
    void LargestElementTest(){
    int [] barrage = {1,2,3,4,5,6};
    assertEquals(6,Largest.getLarge(barrage));
    }

   @Test
    void ReverseArrayTest(){
    int [] array = {1,2,3,4,5};
       int[] reversedArray = {5,4,3,2,1};
    assertArrayEquals(reversedArray,Largest.reverseArray(array));
   }
   @Test
    void ElementOccurrenceTest(){
    int [] array = {1,2,3,4,5};
    assertTrue(Largest.elementChecker(array,3 ));
   }
   @Test
    void runningTotalTest(){
    int [] array = {1,2,3,4,5};
    assertEquals(15,Largest.runningTotal(array));
   }
}