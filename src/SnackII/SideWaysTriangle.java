package SnackII;

public class SideWaysTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        for (int i = 0; i < 2 * 5;  i++) {
            int colInRow = i > 5 ? 2 * 5 - i: i;

            int totalSpaces = 5 - colInRow;
            for (int s = 0; s < totalSpaces ; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < colInRow; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < i; j++) {

            }
            
        }
        }

    }

