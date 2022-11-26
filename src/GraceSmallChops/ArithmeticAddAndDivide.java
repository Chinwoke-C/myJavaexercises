package GraceSmallChops;

public class ArithmeticAddAndDivide {

    public int SquareNum1(int Num1) {
        return Num1 * Num1;
    }

    public int SquareNum2(int Num2) {
        return Num2 * Num2;
    }

    public int SumOfSquares(int Num1, int Num2) {
        return SquareNum1(Num1) + SquareNum2(Num2);
    }

    public int DiffOfSquares(int Num1, int Num2) {
        return SquareNum1(Num2) - SquareNum2(Num1);
    }
}
