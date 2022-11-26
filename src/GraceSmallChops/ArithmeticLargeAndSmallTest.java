package GraceSmallChops;

import GraceSmallChops.ArithmeticLargeAndSmall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticLargeAndSmallTest {
    ArithmeticLargeAndSmall Arithmetic;
    @BeforeEach
    void startTestWith(){
        Arithmetic = new ArithmeticLargeAndSmall();

    }

    @Test
    void TestSumThreeNum(){
    ArithmeticLargeAndSmall Arithmetic = new ArithmeticLargeAndSmall();
    Assertions.assertEquals(12, Arithmetic.AddThreeNum(2,4,6));
    }
    @Test
    void TestProductsThreeNum(){
        ArithmeticLargeAndSmall Arithmetic = new ArithmeticLargeAndSmall();
        Assertions.assertEquals(48, Arithmetic.Multiply(2,4,6));
    }
    @Test
    void TestAverageOfThreeNum(){
        Assertions.assertEquals(4, Arithmetic.average(2,4,6));
    }
    @Test
    void TestSmallest(){
        Assertions.assertEquals(4, Arithmetic.smallest(4,6,8));
    }
    @Test
    void TestLargest(){
        Assertions.assertEquals(8,  Arithmetic.largest(4,6,8));
    }



}