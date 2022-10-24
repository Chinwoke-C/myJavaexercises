package Chapter7;

import java.security.SecureRandom;

public class SpaceShuffle {


    public static int[] shuffle(int[] flurray) {
        for (int i = flurray.length-1; i >=1 ; i--) {
            SecureRandom rambo = new SecureRandom();
            int j = rambo.nextInt(flurray.length);
           int temp = flurray[i];
           flurray[i] = flurray[j];
           flurray[j] = temp;

            }



        return flurray;
    }
}
