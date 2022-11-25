package YetAnotherWeekend;

import java.util.Arrays;

public class Largest {

    public static int getLarge(int[] barrage) {
       int largest = barrage[0];
        for (int i = 0; i < barrage.length ; i++) {
            if (barrage[i] > largest){
                largest = barrage[i];
            }

        }
        return largest;
    }

    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        int backwardCounter = array.length-1;
//        int forwardCounter = 0;
//        while (backwardCounter <= 0){
//            array[forwardCounter] = array[backwardCounter];
//            forwardCounter++;
//            backwardCounter++;
//        }
        for (int forwardCount = 0; forwardCount < array.length; forwardCount++) {
           reverse[forwardCount] = array[backwardCounter];
           backwardCounter--;
        }

        return reverse;
    }


    public static boolean elementChecker(int[] array, int number) {
        boolean Isin = false;
        for (int i = 1; i <array.length ; i++) {
            if (array[i] == number) {
                Isin = true;
                break;
            }
        }

        return Isin;
    }

    public static int runningTotal(int[] array) {
        int total = 0;
        for (int item:array) {
            total += item;


        }
        return total;
    }


    }


