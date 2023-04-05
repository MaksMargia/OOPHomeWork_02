package HomeWork_2.impl;

import HomeWork_2.*;
import HomeWork_2.Runnable;
import HomeWork_2.Swimmable;
import HomeWork_2.Illable;
import HomeWork_2.Speakable;

public class Dog extends Animal implements Illable, Runnable, Swimmable, Speakable {
    public Dog(String name, String color) {
        super(name, color, 4);
    }

    public Dog(String name) {
        this(name, null);
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    protected void wakeUp() {
        System.out.println("Пёс проснулся");
    }

    private void findFood() {
        System.out.println("Пёс ищет еду");
    }

    private void eat() {
        System.out.println("Пёс ест");
    }

    public void toPlay() {
        System.out.println("Пёс играется");
    }

    public void goToSleep() {
        System.out.println("Пёс уснул");
    }

    @Override
    public void getIll() {
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }

    @Override
    public int getSwimSpeed() {
        return 3;
    }

    @Override
    public String speak() {
        System.out.println("Собака произносит: Гав-гав!");
        return null;
    }
}


