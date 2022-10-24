package Chapter7;

import java.util.Arrays;

public class ShuffleArrayDrive {
    public static void main(String[] args) {
        int[]  num = {1,2,3,4,5,6};
        ShuffleArray myShuffle = new ShuffleArray();
        int[] reshuffle = myShuffle.shuffle(num);
        System.out.println(Arrays.toString(reshuffle));

    }
}
