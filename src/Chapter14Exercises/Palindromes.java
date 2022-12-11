package Chapter14Exercises;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        StringBuilder buffer = new StringBuilder(input.nextLine());
        StringBuilder word2 = buffer.reverse();
      if (buffer.equals(word2)){
          System.out.println("it is palindrome");
      }else {
          System.out.println("Not a palindrome");
      }


    }
}