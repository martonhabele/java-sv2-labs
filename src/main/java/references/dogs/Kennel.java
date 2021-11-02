package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        Dog dog = new Dog("Basset Hound", 5, "brown");
        dogs.add(dog);
        Dog dog1 = new Dog("Pug", 3, "black");
        dogs.add(dog1);
        Dog dog2 = new Dog("Malamut", 7, "white");
        dogs.add(dog2);
        System.out.println(dogs);

        Dog dog3 = dogs.get(1);
        dog3.setColour("yellow");
        System.out.println(dogs);

        Dog dog4 = new Dog("Akita", 4, "hazel");
        System.out.println(dog4.toString());

        dog4 = dogs.get(1);
        System.out.println(dog4.toString());

        Dog dog5 = dog3;
        dog5.setColour("marine");
        System.out.println(dogs);

        List<Dog> moreDogs = dogs;
        Dog dog6 = dog3;
        dog6.setColour("red");
        System.out.println(moreDogs);

        dog1.setColour("pink");
        System.out.println(moreDogs);

        dog1 = null;
        System.out.println(moreDogs);

        Dog dog7 = dogs.get(1);
        dog7 = null;
        System.out.println(moreDogs);

        Dog dog8 = dogs.get(1);
        dog8.setColour("violet");
        System.out.println(moreDogs);
    }
}