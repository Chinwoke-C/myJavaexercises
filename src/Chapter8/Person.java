package Chapter8;

public class Person {
    private  Day dayOfBirth;
    private int day;

    public  Person(Day dayOfBirth, int day){
        this.day = day;
        this.dayOfBirth = dayOfBirth;
    }

    public int getDay() {
        if (day > 31) throw new IllegalArgumentException("Invalid day");

        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Day getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Day dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
}
