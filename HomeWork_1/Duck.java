package HomeWork_1;

public class Duck extends Animal {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Кря-кря!");
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
    public void toGo() {
        System.out.println("Утка: Я плохо бегаю!");
    }
}
