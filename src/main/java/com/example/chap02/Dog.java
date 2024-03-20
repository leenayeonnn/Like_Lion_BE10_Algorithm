package com.example.chap02;

public class Dog {
    private String breed;
    private int age;
    private String color;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void bork() {
        System.out.println("Woof!!");
    }

    void displayInfo() {
        System.out.printf("Breed : %s , Age : %d , Color : %s\n", breed, age, color);
    }
}
