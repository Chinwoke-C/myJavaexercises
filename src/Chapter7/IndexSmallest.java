package Chapter7;

import java.util.Scanner;

public class IndexSmallest {
    public static int indexOfSmallestElement(double[] array) {
   int minimumIndex = 0;
        for (int i = 1; i <array.length; i++) {
            if (array[i] < array[minimumIndex]){
                minimumIndex = i;
            }

        }
        return minimumIndex;
    }

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double [] array = new double[10];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < array.length ; i++) {
      array[i] = input.nextDouble();

        }
        System.out.printf("the index of the minimum value is %d",indexOfSmallestElement(array));
      }

    }



