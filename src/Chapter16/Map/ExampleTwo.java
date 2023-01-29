package Chapter16.Map;

import java.util.Map;

public class ExampleTwo {
    public static void main(String[] args) {
        Map<String, Integer> calender = Map.of(
                "January", 31,
                "February", 28,
                "June", 12,
                "May", 31,
                "October", 17
        );
        calender.replace("May", 50);

    }
}
