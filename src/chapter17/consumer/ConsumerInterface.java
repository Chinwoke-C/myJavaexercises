package chapter17.consumer;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<Integer> consumer =
                (Integer number) -> System.out.println("number passed to accept:: "+number);
        consumer.accept(5);

    }
}
