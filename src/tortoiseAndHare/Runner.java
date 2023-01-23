package tortoiseAndHare;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Runner {
    public static Random random = new Random();
    public  int origPosition;
    public int currentPosition;
    public String runnerSymbol;
    public int lane;
    public String name;
    public String moveDescription;
    public static List<Runner> runners = new ArrayList<>();

    public int getMoveType(){

        return random.nextInt(100)+ 1 ;
    }
    public void makeMove(int spaces){
        origPosition = currentPosition;
        if (currentPosition + spaces < 0){
            currentPosition = 0;
        } else if (currentPosition + spaces >= Track.TRACK_LENGTH) {
            currentPosition = Track.TRACK_LENGTH;
        }else
            currentPosition += spaces;

    }
}
