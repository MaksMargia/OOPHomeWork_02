package HomeWork_2.impl;

import HomeWork_2.*;
import HomeWork_2.Runnable;
import HomeWork_2.Flyable;
import HomeWork_2.Illable;
import HomeWork_2.Swimmable;
import HomeWork_2.Speakable;

public class Duck extends Animal implements Flyable, Illable, Runnable, Swimmable, Speakable {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public String speak() {
        System.out.println("Утка произносит: Кря-кря!");
        return null;
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    protected void wakeUp() {
        System.out.println("Утка проснулся/лась");
    }

    private void findFood() {
        System.out.println("Утка ищет еду");
    }

    private void eat() {
        System.out.println("Утка ест");
    }

    public void toPlay() {
        System.out.println("Утка играется");
    }

    public void goToSleep() {
        System.out.println("Утка уснул/а");
    }

    @Override
    public int getFlightSpeed() {
        return 85;
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getRunSpeed() {
        return 5;
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }
}
