package fakeDiary;

import java.time.LocalDateTime;

public class Entry {
    private  int id;
    private String title;
    private String body;
    private LocalDateTime timeStamp;
    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        timeStamp = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Entry{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", body='").append(body).append('\'');
        sb.append(", timeStamp=").append(timeStamp);
        sb.append('}');
        return sb.toString();
    }

//    public void update(FakeDiary fakeDiary) {
//    }
}
