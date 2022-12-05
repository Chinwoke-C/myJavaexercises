package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private boolean isLocked = true;
    private String password;
    private List<Entry> entries = new ArrayList<>();

    public Diary(String ownersName, String password){
        this.password = password;

    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlockWith(String password) {
        boolean passwordMatches = password.equals(this.password);
        if (passwordMatches){
            this.isLocked = false;
        }
    }


    public void Lock() {
        isLocked = true;
    }

    public void write(String title, String body) {
        if (isLocked) throw new IllegalArgumentException("You cannot write into a locked diary");
//        if (!isLocked){
        writeIntoDiary(title, body);
        }


    private void writeIntoDiary(String title, String body) {
        int id = numberOfEntries() + 1;
        Entry newEntry = new Entry(id, title, body);
        entries.add(newEntry);
    }

    public int numberOfEntries() {
        return entries.size();
    }

    public Entry findEntryWithId(int id) {
        for (Entry entry : entries){
            if (entry.getId() == id) return entry;
        }
//        return entries.get(id-1);
        return null;
    }
    public boolean updateDiary(Entry old, Entry newEntry){
        int  findUpdate = searchDiaries(old);
        if (findUpdate > 0){
            entries.set(findUpdate, newEntry);
            System.out.println(old.getTitle()+ " has been updated by "+ newEntry.getTitle());
            return true;
        }

        return false;
    }
    public int searchDiaries(Entry entry){
        return this.entries.indexOf(entry);
    }
    public Entry searchDiaries(String title){
        for (int i = 0; i < this.entries.size(); i++) {
            Entry heading = this.entries.get(i);
            if (heading.getTitle().equalsIgnoreCase(title));
            { return heading;}

        }
        return null;
    }

    public void DeleteEntryWithId(int id) {
        entries.remove(findEntryWithId(id));
    }
}
