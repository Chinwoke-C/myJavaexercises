package GraceSmallChops;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int month;
    private int day;
    private int year;
    private int height;
    private int weight;
    private int age;

    public HealthProfile(String name, String surname, String gender, int month, int day, int year,
            int height, int weight ){
        firstName = name;
        lastName = surname;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }
    public void setFirstname(String name){
        firstName = name;
    }
    public String getFirstname(){
        return firstName;
    }
    public void setLastname(String surname){
        lastName = surname;
    }
    public String getLastname(){
        return lastName;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
    public void setAge(int age){
         this.age = age;
    }
    public int getAge(){
        age = 2022 - year;
        return age;
    }
    public int getMaximumHeartRate(){
        return 220 - getAge();
    }
    public void getTargetHeartRate(){
       int heart = 50 * getMaximumHeartRate() / 100;
      int   rate = 85 * getMaximumHeartRate() / 100;
        System.out.printf("The target heart rate is %d and %d bpm", heart, rate);

    }
}
