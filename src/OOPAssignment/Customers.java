package OOPAssignment;

import java.util.List;

public class Customers extends Users {
    protected Billing billingInformation;
    protected List <Items> shoppingCart;

//    public Customers(int age, String eMailAddress, Address homeAddress, String password, String phoneNumber, Billing billingInformation, List<Items> shoppingCart) {
//        super(age, eMailAddress, homeAddress, password, phoneNumber);
//        this.billingInformation = billingInformation;
//        this.shoppingCart = shoppingCart;
//    }

    @Override
    public void getEmail() {
        System.out.println("customer email is a scam");
    }
}
