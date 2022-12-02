package PhoneBook;

public class Contact {
    private String name;
    private String phoneNo;
    private int id;


    public Contact(int id, String name, String phoneNo) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public int getId() {
        return id;
    }
}
