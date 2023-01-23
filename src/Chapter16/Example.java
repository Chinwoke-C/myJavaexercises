package Chapter16;

import java.util.*;

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
        System.out.println(Collections.max(num));
        System.out.println("smallest:: "+minimum);
        }

    }

