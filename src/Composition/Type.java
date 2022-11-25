package Composition;

public enum Type {
    EXECUTIVE(15_000),
    CHEAP(10_000),
    AWOYAYA(1_500);

    private final int price;

    Type(int price){
        this.price = price;
    }
}
