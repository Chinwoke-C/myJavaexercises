package chapter17.streams;

import java.util.stream.IntStream;

public class ExampleThree {
    public static void main(String[] args) {
        // int sum = IntStream.rangeClosed(1,10).map((x) -> x % 2).map((x) -> x * x * x)
//                            .filter((n) -> n%2 == 0)
                            //.map((x)-> x %2 * 18)
        // .sum();

        //System.out.println(sum);


        System.out.println(IntStream.rangeClosed(1, 10).map((x) -> {
            if (x % 2 == 0) {
                return x * 3;
            } else {
                return 0;
            }
        }).sum());
    }
}
