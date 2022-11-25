package Relationships;

public class Guy {
    private String name;
    private String phoneNumber;
    private Babe girlfriend;

    public void changeBabe(Babe newBabe){
        girlfriend =newBabe;
    }
    public String whatsYaBabesName(){

        return girlfriend.getName();
    }
}
