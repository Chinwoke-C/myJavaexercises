package Chapter7;

public class InitMultiArray {
    public static void main(String[] args) {
        int[][] vray1 = {{1, 2, 3}, {4,5,6}};
        int [] [] vray2 ={{1,2}, {3},{4,5,6}};

        System.out.println("Values in vray1 by rows are:");
        outputArray(vray1);

        System.out.println("Values in vray2 by rows are:");
        outputArray(vray2);
    }

    private static void outputArray(int[][] Array) {
        for (int rows = 0; rows < Array.length ; rows++) {
            for (int column = 0; column < Array[rows].length; column++) {
                System.out.printf("%d  ",Array[rows][column]);

            }
            System.out.println();
            
        }
        
    }
}
