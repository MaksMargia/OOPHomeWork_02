package HomeWork_2.impl;

import HomeWork_2.Animal;
import HomeWork_2.Illable;
import HomeWork_2.Runnable;
import HomeWork_2.Speakable;

public class Cat extends Animal implements Illable, Runnable, Speakable {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public String speak() {
        System.out.println("Кот произносит: Мяу-мяу!");
        return null;
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    protected void wakeUp() {
        System.out.println("Кот проснулся");
    }

    private void findFood() {
        System.out.println("Кот ищет еду");
    }

    private void eat() {
        System.out.println("Кот ест");
    }

    public void toPlay() {
        System.out.println("Кот играется");
    }

    public void goToSleep() {
        System.out.println("Кот уснул");
    }

  //  public void toGo() {}

    @Override
    public void getIll() {
        System.out.println(String.format("%s заболел", this.getName()));
    }

      @Override
    public int getRunSpeed() {
        return 45;
    }
}




