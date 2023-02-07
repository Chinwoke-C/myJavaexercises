package chapter17.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(nums.stream()//[1,2,3,4,5]
                .map(number ->number*number) //[1,4,9,16,25]
                        .map(number -> number * number) // [1,16,81,256,625]
                        .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));


}
}
