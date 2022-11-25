package Chapter8;

import java.math.BigDecimal;

import static java.lang.System.out;

public class PersonDriver {
    public static void main(String[] args) {
        Person person = new Person(Day.TUESDAY, 7);
        person.setDayOfBirth(Day.SATURDAY);
        out.print(person.getDayOfBirth()+ " ");
        out.print(person.getDay());

        BigDecimal salary = new BigDecimal(4500);
        BigDecimal stipend = new BigDecimal(2000);

    }
}
