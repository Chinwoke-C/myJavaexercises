package Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DiaryTest {

   Diary amirahDiary;
    @DisplayName("Test that diary exists")
    @BeforeEach
    public  void setUp(){
        amirahDiary = new Diary("Amirah","correctPassword");
    }
    @Test
    public  void diaryExistTest(){
        assertNotNull(amirahDiary);
    }
    @Test
    public  void newDiaryIsLocked(){
        assertTrue(amirahDiary.isLocked());
    }
    @Test
    public  void lockedDiaryCanBeUnlocked(){
        assertTrue(amirahDiary.isLocked());
        amirahDiary.unlockWith("correctPassword");
        assertFalse(amirahDiary.isLocked());
    }
    @Test
    public void wrongPasswordCannotUnlockDiaryTest(){
        assertTrue(amirahDiary.isLocked());
        amirahDiary.unlockWith("wrongPassword");
        assertTrue(amirahDiary.isLocked());
    }
    @Test
    public void diaryCanBeLockedTest(){
        amirahDiary.unlockWith("correctPassword");
        assertFalse(amirahDiary.isLocked());
        amirahDiary.Lock();
        assertTrue(amirahDiary.isLocked());
    }
    @Test
    public void EntriesCanBeAddedToTheDiary(){
        amirahDiary.unlockWith("correctPassword");
        assertFalse(amirahDiary.isLocked());

        amirahDiary.write("My breakup with Simi",
                "I did not do anything to him oh, He just came back one day and...");
        assertEquals(1, amirahDiary.numberOfEntries());
    }
    @Test
    public void entriesCannotBeAddedWhenDiaryIsLockedTest(){
        assertTrue(amirahDiary.isLocked());
        amirahDiary.write("My breakup with Simi",
                "I did not do anything to him oh, He just came back one day and...");

    }
    @Test
    public void entriesCanBeViewedTest(){
        amirahDiary.unlockWith("correctPassword");
        assertFalse(amirahDiary.isLocked());

        amirahDiary.write("My breakup with Simi",
                "I did not do anything to him oh, He just came back one day and...");
        assertEquals(1, amirahDiary.numberOfEntries());

        Entry foundEntry = amirahDiary.findEntryWithId(1);
        assertEquals(1, foundEntry.getId());
        assertEquals("My breakup with Simi", foundEntry.getTitle());
        assertEquals("I did not do anything to him oh, He just came back one day and...",
                foundEntry.getBody());
    }

}
