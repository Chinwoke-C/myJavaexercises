package GraceSmallChops;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the numbers you would like to input");
        int num = scanner.nextInt();
        int [] myArray = new int[num];
        int count = 0;
        int res = 0;

//        System.out.println("The total number of elements in the array is "+ myArray.length);

        for (int i = 0; i < myArray.length ; i++) {
             myArray[count] = myArray[i] + 24;
              res += myArray[count];
//            System.out.println(myArray[0]);
            count++;
        }
        System.out.println(res);



//        myArray[12] = 24;
//        myArray[0] = 2;
//        myArray[5] = 14;
//
////
//        System.out.println(myArray[12]);
//        System.out.println(myArray[0]);
//        System.out.println(myArray[5]);
////            int res = count+ 1;
////        for (int i = 0; i < myArray.length; i++) {
////            System.out.println("array index of " + res + " = " +myArray[i]);
////            res++;
////        }
//        double res = myArray[12] / myArray[0];
//        System.out.println("The division between "+myArray[12]+ " and "+ myArray[0]+ " = "+res);

    }
}
