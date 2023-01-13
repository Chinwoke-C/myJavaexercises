package fakeDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FakeDiaryTest {
    FakeDiary fakeDiary;
    @BeforeEach
    public void setUp(){
        fakeDiary = new FakeDiary("chi123");
    }
    @Test
    public void fakeDiaryExistsTest(){
        FakeDiary fakeDiary = new FakeDiary("chi123");
        assertNotNull(fakeDiary);
    }
    @Test
    public void fakeDiaryIsLockedTest(){
        fakeDiary.isLocked();
        assertTrue(fakeDiary.isLocked());
    }
    @Test
    public void lockedDiaryCanBeUnlockedWithPassWord(){
        assertTrue(fakeDiary.isLocked());
        fakeDiary.UnlockWith("chi123");
        assertFalse(fakeDiary.isLocked());
    }
    @Test
    public void unlockedDiaryCanBeLockedWithPassWord(){
        assertTrue(fakeDiary.isLocked());
        fakeDiary.UnlockWith("chi123");
        assertFalse(fakeDiary.isLocked());
        fakeDiary.lockWith("chi123");
        assertTrue(fakeDiary.isLocked());
    }
    @Test
    public void EntriesCanBeAddedToUnlockedDiary(){
        fakeDiary.UnlockWith("chi123");
        assertFalse(fakeDiary.isLocked());
        fakeDiary.write("The beginning of the end", "It all started on a blur sunny day...");
        assertEquals(1, fakeDiary.numberOfEntries());
    }
    @Test
    public void EntriesCanBeViewedTest(){
        fakeDiary.UnlockWith("chi123");
        assertFalse(fakeDiary.isLocked());
        fakeDiary.write("The beginning of the end", "It all started on a blur sunny day...");
        fakeDiary.write("The end is better than the beginning thereof",
                "It all started on a bright rainy day...");
        assertEquals(2, fakeDiary.numberOfEntries());
        Entry foundEntry = fakeDiary.findEntryById(1);
        assertEquals(1,foundEntry.getId());
        assertEquals("The beginning of the end",foundEntry.getTitle());
        assertEquals("It all started on a blur sunny day...", foundEntry.getBody());


    }
}
