package Chapter16.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExampleFour {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(3);
        num.add(4);
        num.add(3);

        System.out.println("Before sorting:: "+ num);

        num.sort(Comparator.naturalOrder());
        System.out.println(num);
    }
}
