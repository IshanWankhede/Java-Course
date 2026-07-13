package com.ishan.javalearning.oops.Inheritance;

class Aniiimal {

    void eat() {
        System.out.println("Eating");
    }
}

class Doogg extends Aniiimal {

    void bark() {
        System.out.println("Dog Bark");
    }
}

class Catt extends Aniiimal {

    void meow() {
        System.out.println("Cat Meow");
    }
}

public class Hierarchical_Inheritance {

    public static void main(String[] args) {

        Doogg d = new Doogg();
        d.eat();
        d.bark();

        Catt c = new Catt();
        c.eat();
        c.meow();
    }
}