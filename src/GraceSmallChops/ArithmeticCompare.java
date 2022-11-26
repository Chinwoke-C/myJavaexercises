package GraceSmallChops;

public class ArithmeticCompare {



    public int SquareNum(int Num1) {
        return Num1 * Num1;
    }
    public int AddNumAndSquare(int Num2){
        return Num2 + SquareNum(Num2);
    }


    public int BothGreaterThan100(int i) {
        int a = 0;
        if ( i > 100){
            a = 1;
        }
        return a;

    }


    public int BothIs100(int i) {
        int a = 0;
        if (i == 100){
            a = 1;
        }
        return a;
    }

    public int BothIsNot100(int i) {
        int a = 0;
        if (i != 100){
            a = 1;
        }
        return a;
    }


    public int BothLessThan100(int i) {
        int a = 0;
        if (i < 100){
            a = 1;
        }
        return a;
    }
}

