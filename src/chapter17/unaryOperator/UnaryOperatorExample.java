package chapter17.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
    UnaryOperator<String> unaryOperator =
            (name)->String.valueOf(name.length());
        System.out.println(unaryOperator.apply("Amirah"));
    }
}
