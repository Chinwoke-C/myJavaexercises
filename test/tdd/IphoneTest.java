package tdd;

class IphoneTest {
    public static void main(String[] args) {
        Iphone myIphone = new Iphone();
        myIphone.setColor("Red");
        Iphone.setPrice(300_000);
        System.out.println(myIphone.getColor());
        System.out.println(Iphone.getPrice());


    }

}