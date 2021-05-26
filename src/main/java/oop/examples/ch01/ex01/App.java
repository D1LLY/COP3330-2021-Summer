package oop.examples.ch01.ex01;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Cat garfield = new Cat();
        Dog odie = new Dog();
        TwoLeggedDog difo = new TwoLeggedDog();
        Dog fido = new Dog();
        Bird tweetie = new Bird();

        // all animals make a noise
        makeAnimalSounds(odie);
        makeAnimalSounds(difo);
        makeAnimalSounds(fido);
        makeAnimalSounds(garfield);
        makeAnimalSounds(tweetie);

        // cats chase mice
        garfield.chaseMouse();

        // all dogs go to heaven
        ArrayList<Animal> allDogs = new ArrayList<>();
        allDogs.add(odie);
        allDogs.add(difo);
        allDogs.add(fido);

        for(Animal dog : allDogs) {
            gotoHeaven(dog);
        }
    }

    public static void makeAnimalSounds(Animal theAnimal) {
        System.out.println(theAnimal.makeSound());
    }

    public static void gotoHeaven(Animal oldDog) {
        oldDog.move();
    }
}
