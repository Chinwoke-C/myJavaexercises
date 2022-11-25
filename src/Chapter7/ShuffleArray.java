package Chapter7;

import java.security.SecureRandom;

public class ShuffleArray {

    public int[] shuffle(int[] num){
        for (int i = num.length-1; i >= 1; i--) {
            SecureRandom randO = new SecureRandom();
            int j = randO.nextInt(num.length);
           int  temp = num[i];
           num[i] = num[j];
           num[j] = temp;



        }


        return num;
    }

}
