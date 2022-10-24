package Chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class BurstMyBubble {

    public static int[] ascendingSort(int[] bubble) {
        for (int outerIndex = 0; outerIndex < bubble.length - 1; outerIndex++) {
            for (int innerIndex = 0; innerIndex < bubble.length - outerIndex - 1; innerIndex++) {
                if (bubble[innerIndex] > bubble[innerIndex + 1]) {
                    int temp = bubble[innerIndex];
                    bubble[innerIndex] = bubble[innerIndex + 1];
                    bubble[innerIndex + 1] = temp;


                }
            }
        }
        return bubble;
    }

    public static int[] descendingSort(int[] bubble) {
        for (int outerIndex = 0; outerIndex < bubble.length - 1; outerIndex++) {
            for (int innerIndex = 0; innerIndex < bubble.length - outerIndex - 1; innerIndex++) {
                if (bubble[innerIndex] < bubble[innerIndex + 1]) {
                    int temp = bubble[innerIndex];
                    bubble[innerIndex] = bubble[innerIndex + 1];
                    bubble[innerIndex + 1] = temp;

                }
            }
        }
        return bubble;
    }


    public static int[] shuffled(int[] unShuffled) {
        for (int i = unShuffled.length-1; i > 0 ; i--) {
        SecureRandom randomize = new SecureRandom();
            int j = randomize.nextInt(unShuffled.length);
            int temp = unShuffled[i];
            unShuffled[i] = unShuffled[j];
            unShuffled[j] = temp;

        }
        return unShuffled;
    }
}
