package oop.examples.ch01.ex01;

public class Bird extends Animal {
    @Override
    public String makeSound() {
        return "skree";
    }

    @Override
    public void move() {
        System.out.println("[Bird] is moving");
    }
}
