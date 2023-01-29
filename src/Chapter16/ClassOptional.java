package Chapter16;

import Chapter10polymorph.Animal;

import java.util.Optional;

public class ClassOptional {
    public static void main(String[] args) {
        Optional<Animal> foundAnimal = getAnimal();
        Animal animal = foundAnimal.
                orElseThrow(() -> new RuntimeException("Animal not found"));
        animal.speak();
}   public static Optional<Animal> getAnimal() {
        Animal animal = new Animal();
        return Optional.of(animal);
    }

}
