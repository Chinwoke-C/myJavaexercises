package Chapter16.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        Collection<Integer> num = new ArrayList<>();
        num.add(6);
        num.add(7);
        num.add(5);

//        Iterator<Integer> iterator = num.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
        int minimum = Collections.min(num);
        System.out.println("largest:: "+Collections.max(num));
        System.out.println("smallest:: "+minimum);

        Collection<Integer> numbersTwo = new ArrayList<>();
        numbersTwo.add(1);
        numbersTwo.add(2);
        numbersTwo.add(3);

        System.out.println("elements in list numbers:: "+num);
        System.out.println("elements in list numbersTwo:: "+numbersTwo);
        System.out.println("adding elements of numbersTwo to numbers::");
        num.addAll(numbersTwo);

        System.out.println("elements in list numbers:: "+num);
        Iterator<Integer> numbersIterator = num.iterator();
        while (numbersIterator.hasNext())
            System.out.println(numbersIterator.next()+" ");

        ;
        }

    }

