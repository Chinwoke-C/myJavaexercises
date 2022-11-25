package Chapter8;

public class Native {
    private String firstname;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public Native(Human human){
        lastName = human.getLastName();
        firstname = human.getFirstname();
        if (human.getPhoneNumber().length() != 11) throw new IllegalArgumentException("Invalid phone number entered");
        phoneNumber = human.getPhoneNumber();
        emailAddress = human.getEmailAddress();
        emailAddress = human.getEmailAddress();
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
