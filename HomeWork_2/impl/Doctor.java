package HomeWork_2.impl;

import HomeWork_2.Human;

public class Doctor extends Human {
    private String specialization;
    private int age;

    public Doctor(String name, String specialization, int age) {
        super(name);
        this.specialization = specialization;
        this.age = age;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getAge() {
        return age;
    }

        @Override
            public String speak() {
            return String.format("ФИО : %s, Специализация : %s\n", this.getName(), this.specialization);
        }

}
