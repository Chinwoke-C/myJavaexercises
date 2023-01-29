package chapter17.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamArrayOperation {
    public static void main(String[] args) {
        int [] values = {3, 10, 6, 1, 4, 8, 2, 5, 9 ,7};

        //todo: display original values
        System.out.print("Original values: ");
        System.out.println(
                IntStream.of(values)
                        .mapToObj((n)->String.valueOf(n))
                        .collect(Collectors.joining(" ")));

        //todo: count, min, max, sum and average of the values
//        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
//        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());;
//        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());;
//        System.out.printf("Sum:  %d%n", IntStream.of(values).sum());
//        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());
        System.out.println(IntStream.of(values).summaryStatistics());

        //todo: sum of values with reduce method
        System.out.printf("%nSum via reduce method: %d%n",
                IntStream.of(values)
                        .reduce(0,(x,y)->x +y));

        //todo: product of values with reduce method
        System.out.printf("Product via reduce method: %d%n",
                IntStream.of(values)
                        .reduce((x,y)-> x * y).getAsInt());

        //todo: sum of squares of values with map and sum methods
        System.out.printf("Sum of squares via map and sum: %d%n%n",
                IntStream.of(values)
                        .map((x)->x * x)
                        .sum());

        System.out.printf("Values displayed in sorted order: %s%n",
                IntStream.of(values)
                        .sorted()
                        .mapToObj((n)->String.valueOf(n))
                        .collect(Collectors.joining(" "))
        );
    }
}
