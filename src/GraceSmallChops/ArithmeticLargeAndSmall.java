package GraceSmallChops;

public class ArithmeticLargeAndSmall {

    public int AddThreeNum(int Num1, int Num2, int Num3) {
        return Num1 + Num2 + Num3;
    }

    public int Multiply(int Num1, int Num2, int Num3) {
        return Num1 * Num2 * Num3;
        }

    public int average(int NumA, int NumB, int NumC) {
        return AddThreeNum(NumA, NumB, NumC) / 3;
    }

    public int smallest(int NumA, int NumB, int NumC) {
        int i; // i is represented as smallest
         i = NumA;
        if (NumB < NumA){
            i = NumB;
        }
        if (NumC < i){
            i = NumC;
        }
        return i;
    }

    public int largest(int NumA, int NumB, int NumC) {
        int i;
        i = NumA;
        if (NumB > i){
            i = NumB;
        }
        if (NumC > i){
            i = NumC;
        }
        return i;
    }
}


