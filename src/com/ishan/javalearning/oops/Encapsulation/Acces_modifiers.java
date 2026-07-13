package com.ishan.javalearning.oops.Encapsulation;

class Person {

    public String publicVar = "Public";

    private String privateVar = "Private";

    protected String protectedVar = "Protected";

    String defaultVar = "Default";

    public void show() {

        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
    }
}

public class Acces_modifiers {

    public static void main(String[] args) {

        Person p = new Person();

        System.out.println(p.publicVar);

        // System.out.println(p.privateVar); ❌

        System.out.println(p.protectedVar);

        System.out.println(p.defaultVar);
    }
}

/*
Access Modifier Table
Modifier	Same Class	Same Package	Child Class (Different Package)	Everywhere
private	        ✅	         ❌	                    ❌	                    ❌
default	        ✅	         ✅	                    ❌	                    ❌
protected       ✅	         ✅	                    ✅	         	        ❌
public	        ✅	         ✅	                    ✅	                    ✅


 */