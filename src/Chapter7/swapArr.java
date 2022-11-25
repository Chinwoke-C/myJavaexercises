package Chapter7;

import java.util.Arrays;

public class swapArr {
    public static void main(String[] args) {
        int [] assay = {1,3,5,7,8};
//        System.out.println(Arrays.toString(swat(assay)));
        System.out.println(Arrays.toString(swattiest(assay)));
    }
    public static int [] swat(int[] array){
//        int temp = array[0];
//       array[0] = array[1];
//       array[1] = temp;


        return new int[] {array[1], array[0]};
    }
    public static  int [] swattiest(int[] crybaby){
        for (int i = 0; i < crybaby.length ; i++) {
            for (int j = i+1; j < crybaby.length-i-1 ; j++) {
                int temp = crybaby[0];
                 crybaby[i] = crybaby[j];
                 crybaby[j] = temp;

            }
            
        }
        return crybaby;
    }
    }

