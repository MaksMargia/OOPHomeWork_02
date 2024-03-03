package HomeWork_2;

import HomeWork_2.impl.Doctor;

public abstract class Human implements Speakable {
        private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

