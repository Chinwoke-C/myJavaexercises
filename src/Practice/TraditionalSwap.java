package Practice;

import java.util.Arrays;

public class TraditionalSwap {
    public static void main(String[] args) {
        int temp = 0;
        int [] firstArr = {5,3,9,0,1};
        for (int i = 0; i < firstArr.length; i++) {
            for (int j = i + 1; j < firstArr.length ; j++) {
                if (firstArr[j] < firstArr[i]){
                    temp = firstArr[j];
                    firstArr[j] = firstArr[i];
                    firstArr[i] = temp;
                }

            }

        }
        System.out.print(Arrays.toString(firstArr));
    }
}
