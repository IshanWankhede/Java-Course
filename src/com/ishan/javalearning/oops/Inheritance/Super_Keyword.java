package com.ishan.javalearning.oops.Inheritance;

class Person {

    String name = "Unknown";

    Person(String name) {
        this.name = name;
        System.out.println("Person Constructor Called");
    }

    void display() {
        System.out.println("Name : " + name);
    }
}

class Studentt extends Person {

    int rollNo;
    String name = "Student Name";

    Studentt(String personName, int rollNo) {

        super(personName);   // Calls Person constructor

        this.rollNo = rollNo;

        System.out.println("Student Constructor Called");
    }

    void displayStudent() {

        System.out.println("Student Name : " + this.name);

        System.out.println("Person Name : " + super.name);

        System.out.println("Roll No : " + rollNo);

        super.display(); // Calling parent method
    }
}

public class Super_Keyword {

    public static void main(String[] args) {

        Studentt s =
                new Studentt("Ishan", 101);

        s.displayStudent();
    }
}