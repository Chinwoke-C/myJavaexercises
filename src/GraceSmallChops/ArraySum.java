package GraceSmallChops;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraySum {
    public static void main(String[] args) {
        int [] addNumbers = {8,14,12,5,3,4,6};
       int sum = 0;
//        for (int i = 0; i < addNumbers.length ; i++) {
//            sum = sum + addNumbers[i];
        System.out.print("The total values in the array is: ");
        System.out.println(
                IntStream.of(addNumbers)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));
        System.out.printf("The sum of the array is: %d%n", IntStream.of(addNumbers).sum());
    }
}
// The pseudocode
// initialize array addNumbers
// initialize sum to zero
//let i be the index and initialize it to zero
// then increment as long as i is less than the array length
// initialize the variable sum and add it to the array of index i.
