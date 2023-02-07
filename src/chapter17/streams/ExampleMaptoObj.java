package chapter17.streams;

import Chapter8.Day;
import Chapter16.Queue.Person;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ExampleMaptoObj {
    public static void main(String[] args) {
        int [] numbers = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.stream(numbers)
                .mapToObj(element -> buildPerson(element))
                .collect(Collectors.toList()));

    }

    private static Person buildPerson(int age) {
        Person person = new Person("Amirah", age );
        return person;
    }
}
