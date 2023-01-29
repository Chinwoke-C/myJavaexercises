package chapter17.BinaryOperator;

import java.util.function.BinaryOperator;

public class binaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator =
                (name, word)-> name+word;
        System.out.println(binaryOperator.apply("Semicolon", "Native"));
    }
}
