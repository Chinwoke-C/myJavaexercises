package Chapter4;

public class fourThirtyEight {
    public static int factorial(int number){
    int result = 1;
    for (int i = number; i > 0; i-- ){
        result = result * i;
    }
        return result;
    }
}
