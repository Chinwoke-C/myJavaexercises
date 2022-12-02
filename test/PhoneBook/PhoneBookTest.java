package PhoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    PhoneBook thePhoneBook;
    @BeforeEach
    public  void setUp(){
        thePhoneBook = new PhoneBook();
    }
    @Test
    public  void phoneBookExistTest(){
        assertNotNull(thePhoneBook);
    }
    @Test
    public void phoneBookIsClosed(){
       assertTrue(thePhoneBook.isClosed());
    }
    @Test
    public void phoneBookIsOpenTest(){
        assertTrue(thePhoneBook.isClosed());
        thePhoneBook.Open();
        assertFalse(thePhoneBook.isClosed());
    }
    @Test
    public void contactsCanBeAddedToThePhoneBook(){
        thePhoneBook.Open();
        assertFalse(thePhoneBook.isClosed());

        thePhoneBook.addContact("Shola",
                "07040099548");
        assertEquals(1, thePhoneBook.contacts());
    }
    @Test
    public  void contactsCanBeViewedTest(){
        thePhoneBook.Open();
        assertFalse(thePhoneBook.isClosed());

        thePhoneBook.addContact("Shola",
                "07040099548");
        assertEquals(1, thePhoneBook.contacts());

        Contact foundContact = thePhoneBook.searchContactWithId(1);
        assertEquals(1, foundContact.getId());
        assertEquals("Shola", foundContact.getName());

    }
    @Test
    public void contactsCanBeViewedAndThenDeleted(){
        thePhoneBook.Open();
        assertFalse(thePhoneBook.isClosed());

        thePhoneBook.addContact("Shola",
                "07040099548");
        assertEquals(1, thePhoneBook.contacts());

        Contact foundContact = thePhoneBook.searchContactWithId(1);
        assertEquals(1, foundContact.getId());
        assertEquals("Shola", foundContact.getName());

        thePhoneBook.delete(1);
        assertEquals(1,thePhoneBook.delete(1));

    }



}
