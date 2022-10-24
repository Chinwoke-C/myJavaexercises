package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurstMyBubbleTest {
    @Test
    void sortAscensionTest() {
        assertArrayEquals(new int[]{1,2,3,4,5}, BurstMyBubble.ascendingSort(new int[]{5,3,1,2,4}));
    }

    @Test
    void  sortDescendingTest(){
       assertArrayEquals(new int[]{6,5,4,3,2,1},BurstMyBubble.descendingSort(new int[]{1,3,5,6,4,2}));
    }
    @Test
    void shuffleTest(){
     int[] unShuffled = {6,5,4,3,2,1};
       int[] shuffled = new int[unShuffled.length];
        assertNotEquals (shuffled,BurstMyBubble.shuffled(unShuffled));
    }

    }


//}