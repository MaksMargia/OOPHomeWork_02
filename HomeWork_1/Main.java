package Lesson1;

import HomeWork_1.Animal;
import HomeWork_1.Cat;
import HomeWork_1.Dog;
import HomeWork_1.Duck;
import HomeWork_1.Raven;
import HomeWork_1.Goldfish;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Барсик", "коричневый, полосатый"));
        animals.add(new Dog("Мухтар", "серый"));
        animals.add(new Raven("Каррыч", "черный"));
        animals.add(new Duck("Дональд", "белый"));
        animals.add(new Goldfish("Голди", "золотистый"));

        for (Animal a: animals) a.toGo();
        System.out.println();

        for (Animal a: animals) a.fly();
        System.out.println();

        for (Animal a: animals) a.swim();
        System.out.println();
    }

}
