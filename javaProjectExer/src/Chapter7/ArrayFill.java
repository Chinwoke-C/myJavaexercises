package Chapter7;

import java.util.Arrays;

public class ArrayFill {

    public static void main(String[] args) {
        int[] theRay = new int[10];
        for (int i = 0; i < 10; i++) {
            theRay[i] = i + 1;
//            System.out.print(theRay[i] + ", ");
        }
        Arrays.stream(theRay).parallel().forEach(number-> System.out.print(number+ ", "));
    }
    char[] jak ={'x', 'o', 'x', 'o'};

  }
