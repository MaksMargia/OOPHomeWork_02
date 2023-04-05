package HomeWork_2;

import HomeWork_2.impl.*;
import veterinary.VetClinic;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();

        vetClinic
                .addAnimal(new Cat("Маруся", "полосатый"))
                .addAnimal(new Dog("Рэкс", "серый"))
                .addAnimal(new Dog("Рэкс", "серый"))
                .addAnimal(new Goldfish("Злата", "золотистый"))
                .addAnimal(new Raven("Черныш", "черный"))
                .addAnimal(new Duck("Мак-Кряк", "белый"));


        System.out.println("Список животных:");
        for (Animal a : vetClinic.getAllAnimals()) {
            System.out.println(a);
        }

        System.out.println("\nЖивотные, которые могут бегать:");
        for (Runnable r : vetClinic.getRunningAnimals()) {
            System.out.println(r + " Может бежать со скоростью до \n" + r.getRunSpeed() + " км/час");
        }

        System.out.println("\nЖивотные, которые умеют плавать:");
        for (Swimmable s : vetClinic.getSwimmingAnimals()) {
            System.out.println(s + " Может плыть со скоростью до \n" + s.getSwimSpeed() + " км/час");
        }

        System.out.println("\nЖивотные, которые умеют летать :");
        for (Flyable f : vetClinic.getFlyingAnimals()) {
            System.out.println(f + " Может лететь со скоростью до \n" + f.getFlightSpeed() + " км/час");
        }

        System.out.println("\nЖивотные, которые умеют издавать звуки:");
        for (Speakable sp : vetClinic.getSpeakingAnimals()) {
            System.out.println(sp);
            sp.speak();
        }
    }
}

