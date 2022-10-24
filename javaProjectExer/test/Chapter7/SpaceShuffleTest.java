package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceShuffleTest {
    @Test
    void shufflingTest(){
        assertNotEquals(new int[]{6,5,4,3,2,1},SpaceShuffle.shuffle(new int[]{6,5,4,3,2,1}));
    }

}