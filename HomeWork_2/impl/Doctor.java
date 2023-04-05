package HomeWork_2.impl;

import HomeWork_2.Human;

public class Doctor extends Human {
    public Doctor(String name) {
        super(name);
    }

    @Override
    public void heal() {
        System.out.println("Лечу животных");
    }
}
