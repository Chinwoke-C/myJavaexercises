package tdd;

public class TriangleD {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i -1; j++)
                System.out.print(" ");
            for (int k = 10; k > i-1; k--)
                    System.out.print("*");

                System.out.println();


        }
    }
}
