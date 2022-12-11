package Chapter14Exercises;

import java.util.Scanner;
//todo(Comparing Portions of Strings) Write an application that uses String method region-
//        Matches to compare two strings input by the user.
//        The application should input the number of characters
//        to be compared and the starting index of the comparison.
//        The application should state whether the
//        compared characters are equal. Ignore the case of the characters when performing the
//        comparison.
public class ComparingPortions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first input");
        String word1 = input.nextLine();
        System.out.println("Enter second input");
        String word2 = input.nextLine();
    }

    public static boolean compare(String w1, String w2){
        if (w1.regionMatches(0, w2, 0, 5)){
            System.out.println("First 5 characters of w1 and w2 matches");
            return  true;
        }
        else{
            System.out.println("First 5 characters of w1 and w2 do not match");
        }

        return false;
    }

}
