package HomeWork_1;

public class Goldfish extends Animal {
    public Goldfish(String name, String color) {
        super(name, color,0);
    }

    public Goldfish(String name) {
        this(name, null);
    }
    @Override
    public void speak() {
        System.out.println("Буль-буль!");
    }

    @Override
    public void hunt() {

    }

    @Override
    public void fly() {
        System.out.println("Золотая рыбка: Я не могу летать!");
    }

    @Override
    public void toGo() {
        System.out.println("Золотая рыбка: Я не могу бегать!");
    }
}