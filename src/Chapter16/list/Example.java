package Chapter16.list;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);


        System.out.println("number:: "+num);
        List<Integer> list = new Vector<>();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(20);

        System.out.println(num.containsAll(list));
        System.out.println("numbers:: "+num);
        System.out.println("elements at index 2 of numbers-> "+num.get(2));

        System.out.
                println("index of element 3 in numbers:: "+ num.indexOf(3));
        System.out.
                println("last index of element 3 in numbers:: "+num.lastIndexOf(3));

        ListIterator<Integer> numberIterator = num.listIterator();

        while(numberIterator.hasPrevious()){
            System.out.println(numberIterator.previous());
            numberIterator.remove();
            System.out.println(num);
        }



    }

}

