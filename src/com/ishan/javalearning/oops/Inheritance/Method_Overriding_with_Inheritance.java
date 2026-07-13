package com.ishan.javalearning.oops.Inheritance;

class Animali {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dogi extends Animali {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class Method_Overriding_with_Inheritance {

    public static void main(String[] args) {

        Dogi d = new Dogi();

        d.sound();
    }
}

/*
Animal a = new Dog();

Reference decides:
What methods are accessible.

Object decides:
Which overridden method actually runs.

Animal a = new Dog();

a.sound();   // ✅

a.bark();    // ❌ Compiler Error

because compiler only sees Animal.

To access bark():

Dog d = (Dog) a;

d.bark();

This is called Downcasting.
 */