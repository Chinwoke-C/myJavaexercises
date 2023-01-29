package Chapter16.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> fillingStation = new PriorityQueue<>();
        fillingStation.offer("Toyota");
        fillingStation.offer("Honda");
        fillingStation.offer("Peugeot");

        System.out.println(fillingStation.poll());
        System.out.println(fillingStation);


        Iterator<String> iterator = fillingStation.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        String[] cars = new String[3];

    }
}