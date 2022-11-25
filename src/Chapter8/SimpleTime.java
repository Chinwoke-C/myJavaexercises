package Chapter8;

public class SimpleTime {
    private int hour;
    private int minute;
    private int  second;

    public SimpleTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute =minute;
        this.second = second;
    }
//    public String buildString(){
//    return this.toUniversalString();
//    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d",
                this.hour, this.minute, this.second);
    }
}