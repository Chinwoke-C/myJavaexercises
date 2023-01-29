package chapter17.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()-> new Random().nextInt(10);
        for (int i = 0; i <10 ; i++) {
            System.out.print(supplier.get() + " ");
        }

    }
}
