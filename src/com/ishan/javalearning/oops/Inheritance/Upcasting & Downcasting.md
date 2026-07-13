# 12. Upcasting and Downcasting in Java

# Introduction

In Java, because of inheritance, we can store child objects inside parent references.

This concept is called:

```text id="1uf0vl"
Type Casting of Objects
```

There are two types:

```text id="quldmw"
1. Upcasting
2. Downcasting
```

---

# 1. Upcasting

# Definition

Upcasting means:

```text id="9e73f7"
Parent Reference
=
Child Object
```

Syntax:

```java id="f3kqvb"
Parent p = new Child();
```

Example:

```java id="9v7s98"
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Bark");
    }
}
```

```java id="l7c24t"
Animal a = new Dog();
```

This is called:

```text id="gyrk38"
Upcasting
```

---

# Why is Upcasting Allowed?

Because:

```text id="8a0o2d"
Dog IS-A Animal
```

A Dog can always be treated as an Animal.

---

# Memory Representation

```java id="w2fw7e"
Animal a = new Dog();
```

Memory:

```text id="z3v8on"
STACK

a
 |
 |
 v

HEAP
---------------------
Animal Members
Dog Members
---------------------
```

Reference type:

```text id="n5ufnt"
Animal
```

Actual object type:

```text id="c4fxag"
Dog
```

---

# Accessible Members

Example:

```java id="z5g0wa"
Animal a = new Dog();

a.sound();
```

✅ Allowed.

---

```java id="8dzgn1"
a.bark();
```

❌ Error.

Because compiler only sees:

```text id="q7mnd2"
Animal Reference
```

Compiler does not know that object is actually Dog.

---

# Runtime Method Dispatch

```java id="7zqyd0"
Animal a = new Dog();

a.sound();
```

If `sound()` is overridden:

```java id="cz3nry"
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

Output:

```text id="jzrq2n"
Bark
```

Because JVM checks actual object during runtime.

---

# Benefits of Upcasting

```text id="lvc1wq"
✓ Runtime Polymorphism
✓ Flexible Code
✓ Loose Coupling
✓ Framework Development
```

Spring and Java Collections use this heavily.

---

# Example

```java id="88q3bd"
Animal a;

a = new Dog();

a = new Cat();

a = new Cow();
```

Same reference.

Different behaviors.

---

---

# 2. Downcasting

# Definition

Converting parent reference back into child reference.

Syntax:

```java id="tcfwcy"
Child c = (Child) parentReference;
```

Example:

```java id="e2m8h8"
Animal a = new Dog();

Dog d = (Dog) a;
```

This is called:

```text id="rwwu9n"
Downcasting
```

---

# Why is Downcasting Needed?

Suppose:

```java id="h7zqzt"
Animal a = new Dog();
```

Compiler allows only Animal methods.

```java id="5cw6n4"
a.sound();
```

But:

```java id="m3g2pm"
a.bark();
```

❌ Error.

To access Dog methods:

```java id="ydaxny"
Dog d = (Dog) a;

d.bark();
```

---

# Memory

```text id="4c2i6t"
STACK

a --------\
           \
            -----> Dog Object
           /
d --------/
```

Both references point to same object.

No new object is created.

---

# Example

```java id="0es7fk"
class Animal {

    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Bark");
    }
}
```

```java id="25jvct"
Animal a = new Dog();

Dog d = (Dog)a;

d.bark();
```

Output:

```text id="9onvrm"
Bark
```

---

# Invalid Downcasting

```java id="l6z4do"
Animal a = new Animal();

Dog d = (Dog)a;
```

Compiles successfully.

But runtime:

```text id="xgfy8w"
ClassCastException
```

Because actual object is Animal.

Not Dog.

---

# Safe Downcasting using `instanceof`

```java id="5pv1zb"
if(a instanceof Dog) {

    Dog d = (Dog)a;

    d.bark();
}
```

This prevents:

```text id="6bd7cy"
ClassCastException
```

---

# `instanceof`

Checks actual object type.

Example:

```java id="dq7ki8"
Animal a = new Dog();

System.out.println(a instanceof Dog);
```

Output:

```text id="u61n5z"
true
```

---

```java id="mm25bx"
System.out.println(a instanceof Animal);
```

Output:

```text id="swt2g5"
true
```

---

```java id="m7umtx"
System.out.println(a instanceof Cat);
```

Output:

```text id="s6mrg5"
false
```

---

# Upcasting vs Downcasting

| Feature              | Upcasting      | Downcasting           |
| -------------------- | -------------- | --------------------- |
| Direction            | Child → Parent | Parent → Child        |
| Explicit Cast Needed | ❌ No           | ✅ Yes                 |
| Safe                 | ✅ Yes          | ⚠️ Not Always         |
| Runtime Error        | ❌ No           | ✅ Possible            |
| Used For             | Polymorphism   | Access Child Features |

---

# Visualization

### Upcasting

```java id="98ryxh"
Dog d = new Dog();

Animal a = d;
```

```text id="2n7ib5"
Dog Object
↑
Animal Reference
```

---

### Downcasting

```java id="scf8hz"
Dog d = (Dog)a;
```

```text id="6lzkzl"
Animal Reference
↓
Dog Reference
```

---

# Complete Example

```java id="7h6t8e"
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Bark");
    }

    void bark() {
        System.out.println("Dog Bark");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();

        if(a instanceof Dog) {

            Dog d = (Dog)a;

            d.bark();
        }
    }
}
```

Output:

```text id="zjlwm0"
Bark
Dog Bark
```

---

# Important Interview Questions

### Is this valid?

```java id="kcgts7"
Animal a = new Dog();
```

✅ Yes.

---

### Is this valid?

```java id="fy2xbh"
Dog d = new Animal();
```

❌ No.

Compiler Error.

Because every Animal is not a Dog.

---

### Is this valid?

```java id="h4vd35"
Animal a = new Animal();

Dog d = (Dog)a;
```

Compiles.

But gives:

```text id="8fzv6n"
ClassCastException
```

at runtime.

---

# Summary

## Upcasting

```text id="7phd9k"
Parent Reference
=
Child Object
```

Example:

```java id="l8lxic"
Animal a = new Dog();
```

Used for:

```text id="lwbjlwm"
Polymorphism
```

---

## Downcasting

```text id="mr3d8z"
Child Reference
=
(Child) Parent Reference
```

Example:

```java id="by9qj1"
Dog d = (Dog)a;
```

Used for:

```text id="1c5xfx"
Accessing Child-Specific Methods
```

---

# Easy Formula

```text id="pxfc4w"
Upcasting
↓
Generalization

Downcasting
↓
Specialization
```
