package Chapter16.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SampleOne {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(23);
        numbers.add(33);
        numbers.add(43);
        numbers.add(23);
        numbers.add(43);
        numbers.add(33);
        numbers.add(43);
        numbers.add(23);

        System.out.println("Number before removeAll -> "+numbers);
        Set<Integer> set  = new TreeSet<>();
        set.add(43);
        set.add(33);
        set.add(23);

        numbers.removeAll(set);
        System.out.println("Number after the removeAll-> "+numbers);
        set.add(43);
        set.add(33);
        set.add(23);
        numbers.addAll(set);

        System.out.println("Number after the addAll-> "+numbers);

}
}
