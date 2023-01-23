package tortoiseAndHare;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TortoiseAndHareTest {
    TortoiseAndHare tortoiseAndHare;

    @BeforeEach
    void startAllTestWith() {
        tortoiseAndHare = new TortoiseAndHare();
    }

    @Test
    void showTrackTest(){
        tortoiseAndHare.displayTrack();
        assertTrue(tortoiseAndHare.isdisplayTrack());
    }
    @Test
    void showRunnersTest(){


    }

}
