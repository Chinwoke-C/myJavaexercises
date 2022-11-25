package Chapter7;

public class ArraySort {
    public int[] ascendingOrder(int[] myArray){
        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = 0; j < myArray.length-i-1 ; j++) {
                if (myArray[j] > myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }

            }

        }


        return myArray;
    }
    public int[] descendingOrder(int[] myArray){
        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = 0; j < myArray.length-i-1; j++) {
                if (myArray[j] < myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }

            }

        }
        return myArray;
    }
}
