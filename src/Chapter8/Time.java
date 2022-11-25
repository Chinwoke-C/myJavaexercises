package Chapter8;

public class Time {

    private int hour;
    private int minute;
    private  int second;

    public Time(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public static  void validateTime(int hour, int minute, int second){
        validateSecond(second);

        validateMinute(minute);

        validateHour(hour);

    }

    public static void validateHour(int hour) {
        boolean hourIsInvalid = hour > 23 || hour < 0;
        if (hourIsInvalid) throw new IllegalArgumentException("Hour is invalid");
    }

    public static void validateMinute(int minute) {
        boolean minuteIsInvalid = minute > 59 || minute < 0;
        if (minuteIsInvalid) throw new IllegalArgumentException("Minute is invalid");
    }

    public static void validateSecond(int second) {
        boolean secondIsInvalid = second > 59 || second < 0;
        if (secondIsInvalid) throw new IllegalArgumentException("Second is invalid");
    }

}
