package chapter17.biFunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction = (word,number)->word.length()==number;

        System.out.println(biFunction.apply("Amirah", 6));
    }
}
