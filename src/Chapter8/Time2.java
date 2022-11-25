package Chapter8;

public class Time2 {
    private int hour;
    private int minute;
    private int second;

    public Time2() {
        this(0, 0, 0 );
    }
    public Time2(int hour){
        this(hour, 0, 0);
    }
    public Time2(int hour, int minute){
        this(hour, minute, 0);
    }
    public Time2(int hour, int minute, int second){
        Time.validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public  Time2(Time2 time){
        this(time.hour, time.minute, time.second);
    }

    public void setTime(int hour, int minute, int second) {
        Time.validateHour(hour);
        Time.validateMinute(minute);
        Time.validateSecond(second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(),getSecond());
    }


    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour()== 0 ||getHour() == 12 )? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public static void main(String[] args) {
        Time2 myTime = new Time2();
        myTime.setTime(13, 45, 54);
        System.out.println(myTime.toString());

    }
}



