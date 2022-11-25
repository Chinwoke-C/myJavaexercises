package Chapter7;

public class SchoolAdmin {

    private int[][] nativeScores = new int[2][5];
    private  double[] averageScores = new double[2];
    public SchoolAdmin(){
    }

    public SchoolAdmin(int[][] scores){
        nativeScores = scores;
    }

    public int[][] getNativeScores() {
        return nativeScores;
    }

    public void setNativeScores(int[][] nativeScores) {
        this.nativeScores = nativeScores;
    }

    public double[] getAverageScores() {
        return averageScores;
    }

    public void calculateAverageScore(){
        int totalScore = 0;
        for (int i = 0; i < nativeScores.length ; i++) {
            for (int j = 0; j <nativeScores.length ; j++) {
                totalScore += nativeScores[i][j];
            }

            averageScores[i] = totalScore/ nativeScores.length;
        }
    }
}
