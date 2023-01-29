package Chapter16.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExampleThree {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);

        System.out.println("Number before removeAll -> "+numbers);
        Set<Integer> set  = new TreeSet<>();
        set.add(1);
        set.add(2);

        numbers.addAll(set);
        System.out.println("Number after the removeAll-> "+numbers);

    }
}