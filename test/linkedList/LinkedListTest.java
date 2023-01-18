package linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LinkedListTest {
    ChiLinkedList list;

    @BeforeEach
    void setUp() {
        list = new ChiLinkedList();
    }

    @Test
    public void headAndTailIsNullTest() {
        assertTrue(list.isEmpty());
    }

    @Test
    public void addElementToHeadTest() {
        assertEquals("camry", list.addFirst("camry"));
    }

    @Test
    public void addElementToTailTest() {
        assertEquals("mercedes", list.addLast("mercedes"));
    }

    @Test
    public void insertTest() {
        list.addFirst("camry");
        list.addLast("mercedes");
        list.insert(2, "volvo");
       assertEquals(3,list.entries());

    }
    @Test
    public void getElementTest(){
        list.addFirst("camry");
        list.addLast("mercedes");
        list.insert(2, "volvo");
        String findByIndex = list.getValueByIndex(0);
        assertEquals("camry", findByIndex);
    }
    @Test
    public void getIndexOfElementTest(){
        list.addFirst("camry");
        list.addLast("mercedes");
        list.insert(2, "volvo");
        int findIndexByValue = list.getIndexByValue("volvo");
        assertEquals(2, findIndexByValue);
    }
    @Test
    public void removeAllElementsTest(){
        list.addFirst("camry");
        list.addLast("mercedes");
        list.insert(2, "volvo");
        list.remove();
        assertEquals(0, list.entries());
    }



}
