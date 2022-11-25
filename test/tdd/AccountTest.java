package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void depositMoneyTest() {
        Account myAccount = new Account();
        myAccount.deposit(3000);
        assertEquals(3000, myAccount.getBalance());

    }
    //Given i have an account
    Account myAccount = new Account();
}
