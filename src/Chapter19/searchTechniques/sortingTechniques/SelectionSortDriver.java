package Chapter19.searchTechniques.sortingTechniques;

import java.security.SecureRandom;
import java.util.Arrays;

import static Chapter19.searchTechniques.sortingTechniques.SelectionSort.selectionSort;

public class SelectionSortDriver {
    public static void main(String[] args) {
    SecureRandom random = new SecureRandom();
    int [] data =random.ints(10,10,91).toArray();
        System.out.printf("Unsorted array: %s%n%n", Arrays.toString(data));
        selectionSort(data);
        System.out.printf("%nSorted array: %s%n", Arrays.toString(data));

    }
}

