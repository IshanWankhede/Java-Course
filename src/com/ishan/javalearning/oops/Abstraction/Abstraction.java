package com.ishan.javalearning.oops.Abstraction;

abstract class Animal {

    // Abstract Method
    abstract void sound();

    // Normal Method
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
        a.eat();
    }
}