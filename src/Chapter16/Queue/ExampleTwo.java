package Chapter16.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExampleTwo {
    public static void main(String[] args) {
        Person person = new Person("Amirah", 45);
        Person personTwo = new Person("Chibuzo", 80);
        Person personThree = new Person("Balabulu", 180);
        Person personFour = new Person("Buhari", 130);
        Person personFive = new Person("Shettima", 75);
        Person personSix = new Person("Keyamo", 65 );




        Queue<Person> votersRegistration = new PriorityQueue<>((a,b)->b.getAge()-a.getAge());
        votersRegistration.offer(person);
        votersRegistration.offer(personTwo);
        votersRegistration.offer(personThree);
        votersRegistration.offer(personFour);
        votersRegistration.offer(personFive);
        votersRegistration.offer(personSix);

        System.out.println(votersRegistration.poll());
        System.out.println(votersRegistration.poll());
        System.out.println(votersRegistration.poll());
        System.out.println(votersRegistration.poll());
        System.out.println(votersRegistration.poll());
        System.out.println(votersRegistration.poll());



        System.out.println(votersRegistration);
    }
}
