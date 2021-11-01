package com.company;


public class Dog {
    private String name;
    private int age;
    private breedVariant breed;

    public Dog() {
    }

    public Dog(String name, int age, breedVariant breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name is " + name +
                ", breed is " + breed +
                '}';

    }
}
