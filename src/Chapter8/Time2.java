package Chapter8;
// todo (Enhancing Class Time2) Modify class Time2 of Fig. 8.5 to include a tick method that increments
//        the time stored in a Time2 object by one second. Provide method incrementMinute to increment
//        the minute by one and method incrementHour to increment the hour by one. Write a
//        program that tests the tick method, the incrementMinute method and the incrementHour method
//        to ensure that they work correctly. Be sure to test the following cases:
//        a) incrementing into the next minute,
//        b) incrementing into the next hour and
//        c) incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM).

public class Time2 {
    private int hour;
    private int minute;
    private int second;


    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour) {
        this(hour, 0, 0);
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2(int hour, int minute, int second) {
        Time.validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time2(Time2 time) {
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

    public int tick(int second) {
        if (getSecond() < 59){
            return second+=1;
        }

        return 0;
    }
    public int incrementMinute(int minute){
        if (getMinute() < 59 || getSecond() < 59){
             minute+=1;
            }

        return 0;
    }
    public int incrementHour(int hour){
        if (getHour() < 23 || getMinute() < 59 ||getSecond() < 59){
            return hour+=1;

        }
        return 0;
    }


    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }


    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour()== 0 ||getHour() == 12 )? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public static void main(String[] args) {
        Time2 myTime = new Time2();
        myTime.setTime(13, 59, 59);


//        System.out.println(myTime.tick(21));

    }
}



