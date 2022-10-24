package Chapter7;

import java.util.Arrays;

public class ArraySortDriver {
    public static void main(String[] args) {
        int[] myArray = {5,2,3,1,4};
        ArraySort array = new ArraySort();
       int[] ascent = array.ascendingOrder(myArray);
        System.out.println(Arrays.toString(ascent));

       int[] descent = array.descendingOrder(myArray);
        System.out.println(Arrays.toString(descent));
    }
}
