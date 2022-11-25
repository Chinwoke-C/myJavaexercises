package Chapter5;

public class Lines {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j =5; j >=i+1 ; j--) {
                System.out.print(".");
                }
            System.out.print(i);
            for (int j = 0; j <i-1 ; j++) {
                System.out.print(".");

            }
            System.out.println();

            }
        }
    }

