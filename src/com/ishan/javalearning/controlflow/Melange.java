package com.ishan.javalearning.controlflow;

public class Melange {
    // ==========================
    // Fields
    // ==========================
    private String name;
    private String branch;
    private String registrationId;
    private long contactNumber;
    private static int counter;

    // ==========================
    // Static Block
    // ==========================
    static {
        counter = 1001;
    }

    // ==========================
    // Constructor
    // ==========================
    public Melange(String name, long contactNumber, String branch) {
        this.name = name;
        this.branch = branch;
        this.contactNumber = contactNumber;
        this.registrationId = "D" + counter;
        Melange.counter++;
    }

    // ==========================
    // Getters and Setters
    // ==========================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Melange.counter = counter;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    // ==========================
    // Main Method
    // ==========================
    public static void main(String[] args) {
        Melange student1 = new Melange("Rohit", 1234567889L, "Computer");
        Melange student2 = new Melange("Sayli", 1988612300L, "Mechanical");

        System.out.println("Hi " + student1.getName() +
                "! Your registration id is " + student1.getRegistrationId());

        System.out.println("Hi " + student2.getName() +
                "! Your registration id is " + student2.getRegistrationId());
    }
}

