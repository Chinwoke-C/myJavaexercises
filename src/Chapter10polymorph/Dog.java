package Chapter10polymorph;

public abstract class Dog  extends Animal implements Movable{
    @Override
    public void speak() {
        System.out.println("Bark like a dog");
    }

    public void move() {
        System.out.println("dog walks");
    }
    public abstract void fight();
}
