package HomeWork_1;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color,4);
    }

    public Dog(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Гав-гав!");
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
    public void fly() {
        System.out.println("Пёс: Я не могу летать!");
    }
}

