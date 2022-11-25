package Chapter7;

import java.util.Scanner;

public class ArrayAnalyzer {
    public static Scanner input = new Scanner(System.in);
    public static  double[] numbers;
    public static int noOfItem;
    public static int sum;
    public static double average;

    public static void main(String[] args) {
        collectArraySize();
        collectArrayItems();
        System.out.printf("The average is %.02f",getAverage());
        System.out.println();
        System.out.printf("The total number of elements above average is %d",getTotalNumberOfElementsAboveAverage());

    }

        public static void collectArraySize() {

            System.out.println("Enter the number of items");
             noOfItem = input.nextInt();
             numbers = new double[noOfItem];
            double sum = 0;
        }
        public static void collectArrayItems() {
            System.out.println("Enter the numbers: ");
            for (int i = 0; i < noOfItem; i++) {
                numbers[i] = input.nextInt();
                sum += numbers[i];
            }
        }
        public static double getAverage() {
             average = (double) sum / noOfItem;
            return average;
        }
        public static int getTotalNumberOfElementsAboveAverage(){

            int count = 0;
            for (int i = 0; i < noOfItem; i++) {
                if (numbers[i] > average) {
                    count++;
                }
            }
            return count;
        }

//        System.out.println();
//        System.out.printf("Number of elements above the average is %d", count);
    }

