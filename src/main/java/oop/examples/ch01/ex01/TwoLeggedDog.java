package oop.examples.ch01.ex01;

public class TwoLeggedDog extends CrawlingAnimal {
    @Override
    public String makeSound() {
        return "Walkies?";
    }

    @Override
    public void move() {
        System.out.println("[TwoLeggedDog] is moving");
    }
}
