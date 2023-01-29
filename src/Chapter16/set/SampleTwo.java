package Chapter16.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SampleTwo {
    public static void main(String[] args) {
        Set<String> states = new TreeSet<>(Comparator.reverseOrder());
        states.add("Abia");
        states.add("Bauchi");
        states.add("Borno");
        states.add("Zamfara");
        states.add("zamfara");
        System.out.println("states:: "+ states);
    }
}
