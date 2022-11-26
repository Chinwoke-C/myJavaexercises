package GraceSmallChops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticCompareTest {
    ArithmeticCompare compare;
    @BeforeEach
    void startEachTestWith(){
        compare = new ArithmeticCompare();
    }
    @Test
    void TestSquareOfNum(){
        ArithmeticCompare compare = new ArithmeticCompare();
        Assertions.assertEquals(4, compare.SquareNum(2));
    }
    @Test
    void TestSumOfSquareAndNum(){
        ArithmeticCompare compare =new ArithmeticCompare();
        Assertions.assertEquals(6,compare.AddNumAndSquare(2));
    }
    @Test
    void TestThatNumAndSquareIsGreaterThan100(){
        Assertions.assertEquals(1, compare.BothGreaterThan100(160));
    }
    @Test
    void TestThatNumAndSquareIs100(){
        Assertions.assertEquals(0,compare.BothIs100(2) );
    }
    @Test
    void TestThatSumAndSquareIsNot100(){
        Assertions.assertEquals(1,compare.BothIsNot100(8));
    }
    @Test
    void TestThatSumAndSquareIsLessThan100(){
        Assertions.assertEquals(1,   compare.BothLessThan100(4));

        }
    }
