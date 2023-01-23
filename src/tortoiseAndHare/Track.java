package tortoiseAndHare;

public class Track extends Runner {
    public static final int TRACK_LENGTH = 10;
    public static final int NUM_Of_Runners = 2;
    private String [][] tracks;

    public Track() {
        this.tracks = new String[TRACK_LENGTH + 1][NUM_Of_Runners];
    }

    public void displayRaceTrack() {
        System.out.println("");
        for (int i = 0; i <= TRACK_LENGTH; i++) {
            System.out.printf("%2d |",i);
            for (int j = 0; j < NUM_Of_Runners; j++) {
                if (tracks[i][j]== null){
                    System.out.print("  |");
                }else System.out.print(tracks[i][j] +" | ");
            }
            System.out.println("");
        }
    }
    public void runnerPosition(){

    }
}
