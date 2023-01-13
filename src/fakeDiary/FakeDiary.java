package fakeDiary;


import java.util.ArrayList;
import java.util.List;

public class FakeDiary {
    private boolean isLocked = true;
    private String password;
    private List<Entry> entries = new ArrayList<>();

    public FakeDiary(String password){
        this.password = password;

    }
    public boolean isLocked() {
        return isLocked;
    }

    public boolean UnlockWith(String password) {
        boolean passwordMatches = password.equals(this.password);
        if (passwordMatches){
            isLocked = false;
        }

        return true;
    }

    public void lockWith(String password) {
        boolean unlocked = UnlockWith(password);
        boolean passwordMatches = password.equals(this.password);
        if (unlocked && passwordMatches){
            isLocked = true;
        }
    }

    public void write(String title, String body) {
        if (isLocked) throw  new IllegalArgumentException("you cannot write into a locked diary");
        writeIntoDiary(title,body);
    }

    private void writeIntoDiary(String title, String body) {
        int id = numberOfEntries() + 1;
        Entry newEntry = new Entry(id, title, body);
        entries.add(newEntry);
    }

    public int numberOfEntries() {
        return entries.size();
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries){
            if (entry.getId() == id) return  entry;
        }
        return null;
    }
}
