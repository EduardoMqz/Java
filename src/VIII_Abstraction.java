import java.util.ArrayList;

import Abstraction.Animal;
import Abstraction.Dog;
import Abstraction.Fish;

public class VIII_Abstraction {
    public static void main(String... args) {
        abstractionImplementation();

    }

    public static void abstractionImplementation(){
        //Animal animal = new Animal("animal", "big", 100);
        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(dog);
        animal.add(new Dog("chihuahua", "small", 5));
        animal.add(new Fish("goldfish", "small", 1));
        animal.add(new Fish("barracuda", "bif", 10));
        for (Animal individualAnimal : animal) {
            doAnimalStuff(individualAnimal);
        }

    }

    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("fast");

    }

}
