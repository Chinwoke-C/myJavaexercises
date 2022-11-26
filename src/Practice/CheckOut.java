package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut {
    static java.util.Date date = new java.util.Date();
   static Scanner scanner = new Scanner(System.in);
static ArrayList<String> items = new ArrayList<>();
static ArrayList<Integer> quantity = new ArrayList<>();
static ArrayList<Integer> unitPrice = new ArrayList<>();
static String customerName;
static String additionalItems;
static String cashierName;


    public static void takeCustomerOrder(){
        System.out.println("Enter customer name");
        customerName = scanner.nextLine();

        do {

            System.out.println("What did the customer buy?");
            items.add(scanner.next());

            System.out.println("How many pieces did the customer buy?");
            quantity.add(scanner.nextInt());

            System.out.println("Enter amount of items bought per unit");
            unitPrice.add(scanner.nextInt());

            System.out.println("Do you want to add more items?");
            additionalItems = scanner.next();
            scanner.nextLine();
            additionalItems = additionalItems.toUpperCase();

        }while (additionalItems.equals("YES"));

//        if (additionalItems.equals("NO"));
        System.out.println("Enter cashier's name: ");
        cashierName = scanner.next();
    }
    public static void displayReceiptHeader(){
        System.out.printf("""
   **--------------------------------------------------------------------------**
    |   MAZEECHI INDUSTRIES INTERNATIONAL                                |                                                                                                                                                   
    |   TIME STAMP: %s                                                          |
    |   FORTUNE 500 BOULEVARD AVENUE, ALGONQUIN USA                             |
    |   CUSTOMER NAME: %s                                                       |
    |   CASHIER'S NAME: %s                                                      |
    **-------------------------------------------------------------------------**                                                          
    **-------------------------------------------------------------------------**                                                   
    |%12s%12s%15s%15s        
    """, date, customerName, cashierName, "Item", "Quantity", "Unit Price", "Final Price");
    }
    public static void processOrder(){
        int total = 0;
        for (int i = 0; i < items.toArray().length ; i++) {
            total += quantity.get(i) * unitPrice.get(i);
            System.out.printf("""
                    |%12s%12s%15s%15d                                    |
                    """, items.get(i), quantity.get(i), unitPrice.get(i), quantity.get(i) * unitPrice.get(i));

        }
        int subTotal = (int) (total - (0.07 * total));
        System.out.printf("%39s:%14d%n%39s:%14s%n", "Total", total, "SubTotal", subTotal);
//        System.out.println("How much did you pay?");
//        int input = scanner.nextInt();
    }
}
