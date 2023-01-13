package Chapter15;


public class Accounts {
    public static void main(String[] args) {
        int row = 5;

        while (row > 0){
            int column = 5;
            while (column > 0){
                System.out.println(row % 2 == 0 ? "X":"O");
                --column;
            }
            --row;
            System.out.println();
        }
    }
}
