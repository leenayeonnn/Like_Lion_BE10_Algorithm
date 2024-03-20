package com.example.chap02;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setBreed("Labrador");
        dog.setAge(5);
        dog.setColor("Brown");

        dog.bork();
        dog.displayInfo();
    }
}
