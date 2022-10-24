package tdd;

import java.util.Scanner;

public class JavPow {
    public static void main(String[] args) {
        int base;
        int power;
        int result = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        base = input.nextInt();

        System.out.print("Enter the power: ");
        power = input.nextInt();

      for( int i = 1; i <= power; i++){
          result = result * base;
      }
        System.out.printf("%d%n: " + result, result);
    }
}
