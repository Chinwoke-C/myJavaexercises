package Big_recursive;

public class Recursivity {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6};
        System.out.printf("The BRI is %d",  arraySumRecursive(numbers, numbers.length));
    }
    private static int arraySumRecursive(int[] integers, int size){
        if (size == 0){
            return 0;
        }
            int lastNumber = integers[size - 1];
            int allButLastSum = arraySumRecursive(integers, size -1);



        return lastNumber + allButLastSum;
    }
}
