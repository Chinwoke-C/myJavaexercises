package Chapter19.searchTechniques.sortingTechniques;

public class SelectionSort {
    public static void selectionSort(int [] data){
        for (int i = 0; i < data.length -1 ; i++) {
            int smallest = i;

            for (int index = i + 1; index < data.length ; index++) {
                if (data[index] < data[smallest]){
                    smallest = index;
                }
            }
            swap(data, i , smallest);
            printPass(data, i + 1, smallest);
        }

    }

    private static void printPass(int[] data, int pass, int index) {
        System.out.printf("after pass %2d: ", pass);
        for (int i = 0; i < index ; i++) {
            System.out.printf("%d ", data[i]);
        }
        System.out.printf("%d* ", data[index]); //indicate swap
        for (int i = index; i < data.length ; i++) {
            System.out.printf("%d ", data[i]);
        }
        System.out.printf("%n                   "); //for alignment

        //indicate amount of array that's sorted
        for (int j = 0; j < pass ; j++) {
            System.out.println("-- ");
        }
        System.out.println();
    }

    private static void swap(int[] data, int first, int second) {
        int temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }
}
