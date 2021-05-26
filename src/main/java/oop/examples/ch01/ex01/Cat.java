package oop.examples.ch01.ex01;

public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "meow";
    }

    @Override
    public void move() {
        System.out.println("[Cat] is moving");
    }

    public void chaseMouse() {
        System.out.println("[Cat] is chasing a mouse");
    }

    public void scratch() {
        System.out.println("[Cat] is scratching up a couch");
    }
}
