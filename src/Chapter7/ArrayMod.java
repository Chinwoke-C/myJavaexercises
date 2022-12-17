package Chapter7;

public class ArrayMod {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        for (int values: numbers) {
            System.out.print(values);
        }
        System.out.printf("%d%n",numbers[3]);

       modifyArray(numbers);
        for (int values: numbers) {
            System.out.println(values);
        }

        modifyElement(numbers[3]);
        System.out.print(numbers[3]);
    }

    private static void modifyElement(int element) {
        element*=2;
    }

    private static void modifyArray(int[] numbers2) {
        for (int i = 0; i <numbers2.length ; i++) {
            numbers2[i]*=2;
        }
    }
}
