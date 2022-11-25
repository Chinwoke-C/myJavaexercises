package Chapter4;

import java.math.BigDecimal;

public class Citizien {
    private  String firstName;
    private String surname;
    private BigDecimal earnings;

    public  Citizien(){
    }
    public Citizien(String firstName, String lastName){
        this.firstName = firstName;
        surname = lastName;
    }
    public Citizien(String firstName, String lastName, BigDecimal amount){
        this(firstName, lastName);
        earnings = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getEarnings() {
        return earnings;
    }

    public void setEarnings(BigDecimal earnings) {
        this.earnings = earnings;
    }
}
