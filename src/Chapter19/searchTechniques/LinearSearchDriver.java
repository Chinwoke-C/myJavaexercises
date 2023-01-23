package Chapter19.searchTechniques;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

import static Chapter19.searchTechniques.LinearSearch.linearSearch;

public class LinearSearchDriver {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

//        int[] digits = new int[10];
//        for (int i = 0; i < digits.length ; i++) {
//            digits[i] = 10 + random.nextInt(90);
//        }
        int [] digits = random.ints(10,10,90).toArray();
        System.out.printf("%s%n%n", Arrays.toString(digits));

        System.out.print("please enter an integer(-1 to quit): ");
        int searchInt = input.nextInt();

        while (searchInt != -1){
            int position = linearSearch(digits, searchInt);
            if (position == -1){
                System.out.printf("%d was not found%n%n", searchInt);
            }else{
                System.out.printf("%d was found in position %d%n%n", searchInt, position);

            }
            System.out.print("please enter an integer(-1 to quit): ");
            searchInt = input.nextInt();


        }
    }
}
