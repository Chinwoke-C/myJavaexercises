package chapter17.Biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (name, age) -> doAccept("Amirah", 206);
        biConsumer.accept("Amirah", 206);


    }
    private static void doAccept(String name, Integer age) {
            System.out.println("We are Paragons ");
            System.out.println("Almost done with jave");
            System.out.println("Bulaba, balablu, Vote PDAPC ");
            System.out.println(name + " is " + age + " years old ");
        };
    }
