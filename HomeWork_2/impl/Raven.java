package HomeWork_2.impl;

import HomeWork_2.*;
import HomeWork_2.Runnable;
import HomeWork_2.Speakable;

public class Raven extends Animal implements Flyable, Illable, Runnable, Speakable {
    public Raven(String name, String color) {
        super(name, color,2);
    }

    public Raven(String name) {
        this(name, null);
    }
    @Override
    public void speak() {
        System.out.println("Вопрон прозносит: Кар-кар!");
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    protected void wakeUp() {
        System.out.println("Ворон проснулся");
    }

    private void findFood() {
        System.out.println("Ворон ищет еду");
    }

    private void eat() {
        System.out.println("Ворон ест");
    }

    public void toPlay() {
        System.out.println("Ворон играется");
    }

    public void goToSleep() {
        System.out.println("Ворон уснул");
    }

    @Override
    public int getFlightSpeed() {
        return 38;
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getRunSpeed() {
        return 10;
    }

}
