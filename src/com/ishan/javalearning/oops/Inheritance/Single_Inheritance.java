package com.ishan.javalearning.oops.Inheritance;

class Animals {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dogs extends Animals {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Single_Inheritance {

    public static void main(String[] args) {

        Dogs d = new Dogs();

        d.eat();   // inherited method
        d.bark();  // own method
    }
}