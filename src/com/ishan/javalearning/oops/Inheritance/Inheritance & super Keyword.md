# 7. Inheritance in Java

# What is Inheritance?

Inheritance is a mechanism in which one class acquires the properties and methods of another class.

It provides:

```text id="ud9vby"
Code Reusability
```

---

# Real Life Example

```text id="jph5x5"
Animal
   ↑
  Dog
```

Dog is an Animal.

So Dog can use Animal's properties and methods.

---

# Syntax

```java id="v27ut0"
class Parent {

}

class Child extends Parent {

}
```

`extends` keyword is used for inheritance.

---

# Example

```java id="cctwca"
class Animal {

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking...");
    }
}
```

Usage:

```java id="72gchz"
Dog d = new Dog();

d.eat();
d.bark();
```

Output:

```text id="es2aq5"
Eating...
Barking...
```

---

# Memory Representation

```java id="vr4m0j"
Dog d = new Dog();
```

Memory:

```text id="g4ib5f"
STACK

d
 |
 |
 v

HEAP
---------------------------------
Animal members
Dog members
---------------------------------
```

Child object contains both parent and child members.

---

# Parent Reference Child Object

```java id="87k0m3"
Animal a = new Dog();
```

This is called:

```text id="0trv6f"
Upcasting
```

Allowed because:

```text id="shajye"
Dog IS-A Animal
```

---

# Types of Inheritance in Java

## 1. Single Inheritance

```text id="t8rzr6"
A
↑
B
```

---

## 2. Multilevel Inheritance

```text id="3x7qni"
A
↑
B
↑
C
```

---

## 3. Hierarchical Inheritance

```text id="vt6m0r"
      A
     / \
    B   C
```

---

## 4. Multiple Inheritance

```text id="65a2e0"
A     B
 \   /
   C
```

❌ Not supported using classes.

Reason:

```text id="4m9q8n"
Diamond Problem
```

---

# Diamond Problem

```java id="rb12jl"
class A {
    void show() {}
}

class B extends A {}

class C extends A {}
```

If both B and C had `show()`, Java would not know which one to call.

Therefore Java avoids multiple inheritance using classes.

Interfaces solve this problem.

---

# Constructor Execution Order

Example:

```java id="tz9zpo"
class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog Constructor");
    }
}
```

```java id="ppx5h6"
Dog d = new Dog();
```

Output:

```text id="rshvcm"
Animal Constructor
Dog Constructor
```

---

# Why?

Parent part must be created first.

Execution:

```text id="l1vl8x"
Parent Constructor
↓
Child Constructor
```

---

# Method Inheritance

```java id="zxl8bp"
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

}
```

Dog automatically gets:

```java id="d2t4he"
eat()
```

---

# What is NOT Inherited?

### Constructors ❌

### Private Members ❌

Example:

```java id="p4zdh0"
private int age;
```

Child cannot directly access it.

---

# IS-A Relationship

Inheritance represents:

```text id="0bepyr"
IS-A Relationship
```

Examples:

```text id="j2h3m5"
Dog IS-A Animal

Car IS-A Vehicle

Student IS-A Person
```

---

# HAS-A Relationship

```text id="skt0wf"
Car HAS-A Engine
```

This is not inheritance.

This is composition.

---

# Summary

```text id="i9gfws"
Inheritance
↓
Acquire properties of another class.
```

---

---

# 8. `super` Keyword

# What is `super`?

`super` is a reference variable that refers to the **parent class object**.

Similar to:

```text id="7grn5n"
this → Current Object
super → Parent Part of Current Object
```

---

# Uses of `super`

## 1. Access Parent Variables

Example:

```java id="pnygbo"
class Animal {

    String color = "White";
}

class Dog extends Animal {

    String color = "Black";

    void display() {

        System.out.println(color);

        System.out.println(super.color);
    }
}
```

Output:

```text id="p4b4r0"
Black
White
```

---

# 2. Access Parent Methods

```java id="x4fpc1"
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void sound() {

        super.sound();

        System.out.println("Bark");
    }
}
```

Output:

```text id="kz4pm7"
Animal Sound
Bark
```

---

# 3. Call Parent Constructor

Example:

```java id="n7o1j0"
class Animal {

    Animal() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    Dog() {

        super();

        System.out.println("Dog");
    }
}
```

Output:

```text id="eml5um"
Animal
Dog
```

---

# Important Point

Even if you do not write:

```java id="o8m0zk"
super();
```

Java automatically inserts it.

So:

```java id="6gxjig"
Dog() {

    System.out.println("Dog");
}
```

Internally becomes:

```java id="3lzc3i"
Dog() {

    super();

    System.out.println("Dog");
}
```

---

# Parameterized Parent Constructor

```java id="3z8yd9"
class Animal {

    Animal(String name) {

        System.out.println(name);
    }
}

class Dog extends Animal {

    Dog() {

        super("Tommy");
    }
}
```

Output:

```text id="9e6x5n"
Tommy
```

---

# Rules of `super()`

### Rule 1

```text id="x7tq3l"
super() must be first statement.
```

Correct:

```java id="7l4k4m"
Dog() {

    super();
}
```

Wrong:

```java id="24cmnn"
Dog() {

    System.out.println();

    super();
}
```

---

# `this()` vs `super()`

Both cannot be used together.

❌

```java id="z6tw8v"
Dog() {

    this();

    super();
}
```

Reason:

Both must be first statement.

---

# Constructor Execution Flow

Example:

```java id="mb7l8z"
Dog d = new Dog();
```

Flow:

```text id="sy68c4"
Object Memory Allocation
↓
Animal Constructor
↓
Dog Constructor
↓
Object Ready
```

---

# Memory Representation

```text id="d8pm53"
Dog Object

--------------------------------
Animal Members
--------------------------------
Dog Members
--------------------------------
```

`super` refers to:

```text id="q78q8f"
Animal Members
```

`this` refers to:

```text id="z0kq9q"
Entire Object
```

---

# Example

```java id="twwzkr"
class Parent {

    int x = 10;
}

class Child extends Parent {

    int x = 20;

    void show() {

        System.out.println(this.x);

        System.out.println(super.x);
    }
}
```

Output:

```text id="2xjlwm"
20
10
```

---

# Summary

## Inheritance

```text id="vw3bji"
Child acquires properties
of parent class.
```

Uses:

```text id="cwk4gf"
✓ Code Reusability
✓ Method Overriding
✓ Polymorphism
```

---

## `super`

```text id="5r84yf"
super.variable
↓
Parent Variable

super.method()
↓
Parent Method

super()
↓
Parent Constructor
```

---

# Easy Formula

```text id="n52bn3"
extends
↓
Inheritance

this
↓
Current Object

super
↓
Parent Part of Current Object
```

---

# Important Interview Points

```text id="h9z5co"
✓ Java supports Single, Multilevel,
  and Hierarchical inheritance.

✓ Java does NOT support Multiple
  inheritance using classes.

✓ Constructors are not inherited.

✓ Private members are not inherited.

✓ Parent constructor executes before
  child constructor.

✓ super() is automatically inserted
  by Java compiler.
```
