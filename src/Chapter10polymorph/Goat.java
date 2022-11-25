package Chapter10polymorph;

public class Goat extends Animal{
    @Override
    public void speak() {
        System.out.println("Bleats");
    }
    public void sleep(){
        System.out.println("sleep like an idiot");

    }
}
