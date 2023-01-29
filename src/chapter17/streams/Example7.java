package chapter17.streams;

import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 22, 3, 44, 2, 4, 3, 12, 3, 11, 2, 1);
        System.out.println(nums.stream().count());


}
}
