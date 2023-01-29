package chapter17.Predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate = (word) ->
              word.length()>3;

        System.out.println(predicate.test("semicolon"));
    }
}
