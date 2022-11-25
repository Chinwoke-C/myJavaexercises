package Chapter7;

import java.util.Arrays;

public class ArrayBig {
    public static void main(String[] args) {
        int [] bigOnBig = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(getBigArray(bigOnBig));
    }
    public  static int getBigArray(int [] crayfish) {
        int sum = 0;
        for (int outerIndex = 0; outerIndex < crayfish.length - 1; outerIndex++) {
            for (int innerIndex = 0; innerIndex < crayfish.length - outerIndex - 1; innerIndex++) {
                if (crayfish[innerIndex] > crayfish[innerIndex + 1]) {
                    int temp = crayfish[innerIndex];
                    crayfish[innerIndex] = crayfish[innerIndex + 1];
                    crayfish[innerIndex + 1] = temp;
                }
            }

        }
        sum = crayfish[crayfish.length-1] + crayfish[crayfish.length-2];
        return sum;
    }
}