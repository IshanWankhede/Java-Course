# 9. Method Overloading

# What is Method Overloading?

Method Overloading means:

```text id="9v9q2m"
Same method name
+
Different parameter list
```

It is an example of:

```text id="b4c5lw"
Compile Time Polymorphism
Static Polymorphism
```

---

# Why Use Method Overloading?

Suppose we want to add numbers.

Without overloading:

```java id="0lnulh"
add2(int a, int b)

add3(int a, int b, int c)

addDouble(double a, double b)
```

With overloading:

```java id="1m9hl7"
add(int a, int b)

add(int a, int b, int c)

add(double a, double b)
```

Cleaner and easier to remember.

---

# Example

```java id="i8vwz8"
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

---

# Valid Ways to Overload

## 1. Different Number of Parameters

```java id="rqlwxn"
sum(int a)

sum(int a, int b)
```

---

## 2. Different Data Types

```java id="slh0nm"
sum(int a, int b)

sum(double a, double b)
```

---

## 3. Different Order of Parameters

```java id="l9v3qg"
display(int a, String b)

display(String a, int b)
```

---

# Invalid Overloading

Changing only return type is NOT overloading.

❌ Wrong

```java id="29nl85"
int add(int a, int b)

double add(int a, int b)
```

Compiler error.

Because method signature remains same.

---

# Method Signature

Method Signature =

```text id="86stbm"
Method Name + Parameter List
```

Return type is NOT part of method signature.

---

# Method Resolution

Compiler decides which method to call during compilation.

```java id="fyc7ga"
obj.add(10,20);
```

Compiler immediately knows:

```java id="wq4s7q"
add(int,int)
```

This is why it is called:

```text id="1nzyw5"
Compile Time Polymorphism
```

---

# Summary

```text id="k16k2f"
Same Name
Different Parameters
↓
Method Overloading
```

---

---

# 10. Method Overriding

# What is Method Overriding?

Method Overriding occurs when child class provides its own implementation of a parent method.

Example:

```java id="g3ow6u"
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Bark");
    }
}
```

---

# Example

```java id="ah66vk"
Animal a = new Dog();

a.sound();
```

Output:

```text id="1d9pqv"
Bark
```

Child version executes.

---

# Why Use Overriding?

Different objects can have different behavior.

Example:

```text id="u0o5ed"
Animal → sound()

Dog → Bark
Cat → Meow
Cow → Moo
```

Same method name.

Different implementations.

---

# `@Override`

```java id="5q2jiz"
@Override
void sound() {
    System.out.println("Bark");
}
```

Benefits:

* Improves readability.
* Compiler checks mistakes.

---

# Rules of Overriding

### 1. Method name must be same.

### 2. Parameters must be same.

### 3. Return type must be same (or covariant).

### 4. Child access modifier cannot be more restrictive.

Example:

Parent:

```java id="cr5ymj"
public void show()
```

Child:

```java id="f0hcrq"
private void show()
```

❌ Invalid.

---

# Static Methods Cannot Be Overridden

```java id="vfhjln"
static void show()
```

This is called:

```text id="dvl90l"
Method Hiding
```

---

# final Methods Cannot Be Overridden

```java id="hhlyfr"
final void display()
{
}
```

Child cannot override.

---

# Constructor Cannot Be Overridden

Constructors are not inherited.

---

# Runtime Method Dispatch

```java id="k2s7zh"
Animal a = new Dog();

a.sound();
```

Compiler sees:

```text id="zz1h8u"
Animal
```

But JVM checks actual object:

```text id="b9ebcz"
Dog
```

and executes:

```java id="kz9gqq"
Dog.sound()
```

This is called:

```text id="aq9pf4"
Dynamic Method Dispatch
```

---

# Summary

```text id="hlk0y7"
Same Method Signature
+
Different Implementation in Child
↓
Method Overriding
```

---

---

# 11. Polymorphism

# Meaning of Polymorphism

```text id="s4g2pr"
Poly = Many
Morph = Forms
```

Meaning:

```text id="g8b0lh"
One thing can take many forms.
```

---

# Types of Polymorphism

```text id="lq6u0w"
1. Compile Time Polymorphism
2. Runtime Polymorphism
```

---

# 1. Compile Time Polymorphism

Achieved using:

```text id="a4qydx"
Method Overloading
```

Example:

```java id="xk6y0z"
add(10,20);

add(10,20,30);

add(10.5,20.5);
```

Compiler decides method.

---

# 2. Runtime Polymorphism

Achieved using:

```text id="8h8m4j"
Method Overriding
```

Example:

```java id="gtn2w4"
Animal a = new Dog();
```

The actual method is decided during runtime.

---

# Upcasting

```java id="d8f6qq"
Animal a = new Dog();
```

Meaning:

```text id="67t4ij"
Reference Type → Parent
Object Type → Child
```

This is called:

```text id="1yjyde"
Upcasting
```

---

# Memory

```text id="l1bz32"
STACK

a -------------------->

HEAP
-------------------
Dog Object
-------------------
```

---

# Example

```java id="vzkp3w"
Animal a = new Dog();

a.sound();
```

Output:

```text id="2xy3q4"
Bark
```

Even though reference type is `Animal`.

Because actual object is `Dog`.

---

# Another Example

```java id="v2dd3v"
Animal a;

a = new Dog();

a.sound();

a = new Cat();

a.sound();
```

Output:

```text id="0fh4k8"
Bark
Meow
```

Same reference variable.

Different behaviors.

This is true polymorphism.

---

# Why is Polymorphism Important?

It allows:

```text id="6r4cfm"
Code Reusability
Flexibility
Loose Coupling
Extensibility
```

Frameworks like:

* Spring Boot
* Hibernate
* Java Collections

heavily depend on polymorphism.

---

# Real Life Example

```text id="xtq8b8"
Remote remote;

remote = new TV();

remote = new AC();

remote = new Fan();
```

Same remote.

Different behavior.

---

# Difference Between Overloading and Overriding

| Feature        | Overloading  | Overriding     |
| -------------- | ------------ | -------------- |
| Class Required | Same class   | Parent + Child |
| Parameters     | Different    | Same           |
| Return Type    | Can differ   | Usually same   |
| Binding        | Compile Time | Runtime        |
| Polymorphism   | Compile Time | Runtime        |

---

# Complete Example

```java id="sx9mzd"
class Animal {

    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
```

Output:

```text id="8cbvca"
Bark
Meow
```

---

# Final Summary

## Method Overloading

```text id="08g8hm"
Same Method Name
Different Parameters
↓
Compile Time Polymorphism
```

---

## Method Overriding

```text id="5t16n5"
Parent Method
↓
Child provides new implementation
↓
Runtime Polymorphism
```

---

## Polymorphism

```text id="gxrbrh"
One Reference
Many Forms
```

Examples:

```java id="ehd8f5"
Animal a = new Dog();

Animal a = new Cat();
```

---

# Easy Formula

```text id="8r8m4w"
Overloading
↓
Same Class
Different Parameters

Overriding
↓
Inheritance
Same Signature

Polymorphism
↓
One Interface
Many Behaviors
```
