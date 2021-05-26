package oop.examples.ch01.ex01;

// "is-a" relationships

public class Dog extends WalkingAnimal {
    @Override
    public String makeSound() {
        return "woof";
    }

    @Override
    public void move() {
        System.out.println("[Dog] is moving");
    }
}
