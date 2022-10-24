package Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {
    @Test
    void TestReverseString(){
        String input = "Adeleke";
        String output = ReverseWords.reverse(input);
        assertEquals("ekeledA", output);
    }
    @Test
    void TestTitle(){
        String input = "jerry";
        String output = ReverseWords.capitalFirst(input);
        assertEquals("Jerry", output);
    }
    @Test
    void TestSentenceAsItIs(){
        String input = "JERRY";
        String output = ReverseWords.capitalFirst(input);
        assertEquals("Jerry", output);

}
}