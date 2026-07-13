package com.ishan.javalearning.oops.Encapsulation;

class Student {

    // Private data member
    private String name;
    private int marks;

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class Getter_Setter {

    public static void main(String[] args) {

        Student s = new Student();

        // Setting values
        s.setName("Ishan");
        s.setMarks(95);

        // Getting values
        System.out.println("Name : " + s.getName());
        System.out.println("Marks : " + s.getMarks());
    }
}

/*
private variables
        ↓
Getter & Setter
        ↓
Encapsulation
        ↓
Data Security
 */