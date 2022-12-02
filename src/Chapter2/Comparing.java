package Chapter2;

public class Comparing {
    public int square(int number) {
        int square;
       return square = number * number;
    }

    public boolean compareNumberAndSquareGreaterThan100(int number) {
        int square = square(number);
        int comparingInteger = number + square;
        if (number + comparingInteger > 100){
            return true;
        }

        return false;
    }
}
