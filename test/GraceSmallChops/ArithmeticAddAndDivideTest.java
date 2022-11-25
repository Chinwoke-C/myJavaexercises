package GraceSmallChops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticAddAndDivideTest {
    ArithmeticAddAndDivide Ary;
    @BeforeEach
    void StartTestUsing(){
        Ary = new ArithmeticAddAndDivide();
    }
    @Test
    void TestSquares(){
        ArithmeticAddAndDivide Ary = new ArithmeticAddAndDivide();
        assertEquals(64,Ary.SquareNum1(8));
        assertEquals(256,Ary.SquareNum2(16));
    }
    @Test
    void TestSumOfEachSquares(){
        ArithmeticAddAndDivide Ary = new ArithmeticAddAndDivide();
        assertEquals(320,Ary.SumOfSquares(8,16));
    }
    @Test
    void TestDiffOfEachSquares(){
       assertEquals(192, Ary.DiffOfSquares(8,16));

    }



}