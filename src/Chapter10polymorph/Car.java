package Chapter10polymorph;

public class Car implements Movable{
    @Override
    public void move() {
        System.out.println("car can move");
    }
}
