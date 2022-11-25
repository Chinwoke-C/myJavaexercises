package Chapter7;

import java.util.Scanner;

import static Chapter7.ArrayAnalyzer.input;


public class EnterFiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrays = new int[5];
        collectValidNum(arrays);
        System.out.printf("maximum value is %d",maximum(arrays));
        System.out.println();
        System.out.printf("minimum value is %d",minimum(arrays));
    }

        public static void collectValidNum(int[] arrays){
             int count = 0;
            while(count < 5) {
                System.out.println("Enter a number");
                arrays[count] = input.nextInt();
                if (arrays[count] >= 0 && arrays[count] <= 100){
                    count++;

                } else {
                    System.out.println("Enter a valid number buffon!");
                }
            }
            }

    public static int maximum(int[] arrays){

            int max = arrays[0];
            for (int i = 0; i < 5; i++) {
                if (arrays[i] > max) {
                    max = arrays[i];
                }

            }
        return max;
    }

            public static int minimum(int[] arrays){
            int min = arrays[0];
        for (int i = 0; i < 5 ; i++) {
            if (arrays[i] < min){
                min = arrays[i];
            }

        }

                return min;
            }
    }

