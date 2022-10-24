package tdd;

public class Iphone {

    private String color;
    private static int price;

    public void setColor(String color){
        this.color = color;

    }
    public static void setPrice(int price){
        if(price > 0){
        Iphone.price = price;}
    }
    public String getColor(){
        return color;
    }
   public static int getPrice(){
        return price;
   }
}
