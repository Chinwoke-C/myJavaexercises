package Chapter19.searchTechniques;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

import static Chapter19.searchTechniques.BinarySearch.binarySearch;

public class BinarySearchDriver {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    SecureRandom random = new SecureRandom();

    int [] data = random.ints(15, 10, 91).sorted().toArray();
        System.out.printf("%s%n%n", Arrays.toString(data));

     System.out.printf("please enter an integer value(-1 to quit: ");
     int searchValue = input.nextInt();

     while (searchValue != -1){
         int location = binarySearch(data, searchValue);
         if (location == -1){
             System.out.printf("%d was not found%n%n", searchValue);
         }else
             System.out.printf("%d was found in position %d%n%n", searchValue, location);
         System.out.print("enter an integer value(-1 to quit): ");
         searchValue = input.nextInt();
     }
    }
}
