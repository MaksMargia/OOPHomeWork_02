package HomeWork_2.impl;

import HomeWork_2.*;
import HomeWork_2.Illable;
import HomeWork_2.Swimmable;

public class Goldfish extends Animal implements Illable, Swimmable {
    public Goldfish(String name, String color) {
        super(name, color,0);
    }

    public Goldfish(String name) {
        this(name, null);
    }
    @Override
    public String speak() {
        return null;
    }

    @Override
    public void hunt() {}

    @Override
    public void getIll() {}

    @Override
    public int getSwimSpeed() {
        return 5;
    }
}