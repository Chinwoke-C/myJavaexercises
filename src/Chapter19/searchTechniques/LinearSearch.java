package Chapter19.searchTechniques;

public class LinearSearch {
    public  static int linearSearch(int [] numbers, int searchKey){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchKey)
                return i;
        }
        return -1;
    }
}
