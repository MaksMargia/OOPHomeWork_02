package HomeWork_1;

public class Raven extends Animal {
    public Raven(String name, String color) {
        super(name, color,2);
    }

    public Raven(String name) {
        this(name, null);
    }
    @Override
    public void speak() {
        System.out.println("Кар-кар!");
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
    public void swim() {
        System.out.println("Ворон: Я не умею плвать!");
    }

    @Override
    public void toGo() {
        System.out.println("Ворон: Я плохо бегаю!");
    }
}
