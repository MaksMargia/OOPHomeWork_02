package HomeWork_1;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Мяу-мяу!");
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    private void wakeUp() {
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

    @Override
    public void swim() {
        System.out.println("Кот: Я очень не люблю плвать!");
    }
    @Override
    public  void fly() {
        System.out.println("Кот: Я не могу летать!");
    }
}




