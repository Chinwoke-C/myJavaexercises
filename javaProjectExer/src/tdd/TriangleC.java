package tdd;

public class TriangleC {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                for (int k = i; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

