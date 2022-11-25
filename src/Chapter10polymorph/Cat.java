package Chapter10polymorph;

public class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("Meow");
    }
    public void eat(){
        System.out.println("Eat like a mumu");
    }
}
