package Chief;

public class Native {
    private String nativeId;
    private String firstName;
    private String lastName;
    public Native(){
    }
    public Native(String firstName){
       this.firstName = firstName;
    }

    public String getNativeId() {
        return nativeId;
    }

    public void setNativeId(String nativeId) {
        this.nativeId = nativeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int countNatives(){
        return 1;
    }
}
