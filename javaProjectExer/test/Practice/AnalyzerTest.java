package Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalyzerTest {
    @Test
    void arraySizeCollectionTest(){
       assertEquals(10, Analyzer.arraySize(new int[10] ));
    }
   @Test
   void sumItemsInArrayTest(){
       assertEquals(39, Analyzer.arraySum(new int[]{12,4,6,8,9}));
   }
   @Test
    void AverageTest(){
        assertEquals(7.8, Analyzer.getAverage(new int[]{12,4,6,8,9}));
   }
   @Test
    void ElementAboveAverageTest(){
        assertEquals(5, Analyzer.getElement(new int[]{12,4,6,8,9}));
   }

}