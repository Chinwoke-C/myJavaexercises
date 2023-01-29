package chapter17.biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (word, number)-> word.length() == number;

        System.out.println(biPredicate.test("semicolon", 9));
    }
}