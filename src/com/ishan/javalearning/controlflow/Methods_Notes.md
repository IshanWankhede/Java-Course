# Methods (Functions) in Java

## What is a Method?

A method is a block of code that performs a specific task.

Methods help in:

* Code reusability
* Reducing code duplication
* Improving readability
* Breaking large programs into smaller parts

---

# Important Point

```text
Java Functions = Methods

Functions cannot exist independently.

Every method must belong to a class.
```

### C++

```cpp
void greet()
{
    cout << "Hello";
}
```

Functions can exist outside a class.

---

### Java ❌

```java
void greet()
{
    System.out.println("Hello");
}
```

This is invalid because Java does not allow standalone functions.

---

### Java ✅

```java
public class Main {

    static void greet() {
        System.out.println("Hello");
    }
}
```

Here `greet()` belongs to class `Main`.

---

# Method Syntax

```java
accessModifier static returnType methodName(parameters)
{
    // code
}
```

Example:

```java
public static int add(int a, int b)
{
    return a + b;
}
```

---

# Parts of a Method

```java
public static int add(int a, int b)
```

| Part         | Meaning          |
| ------------ | ---------------- |
| public       | Access modifier  |
| static       | Belongs to class |
| int          | Return type      |
| add          | Method name      |
| int a, int b | Parameters       |

---

# Access Modifiers

| Modifier  | Access                  |
| --------- | ----------------------- |
| private   | Same class only         |
| Default   | Same package            |
| protected | Package + Child classes |
| public    | Anywhere                |

---

# Types of Methods

---

# 1. No Parameters, No Return Value

```java
static void greet()
{
    System.out.println("Hello");
}
```

Calling:

```java
greet();
```

---

# 2. Parameters, No Return Value

```java
static void printName(String name)
{
    System.out.println(name);
}
```

Calling:

```java
printName("Ishan");
```

Output:

```text
Ishan
```

---

# 3. No Parameters, Return Value

```java
static int getNumber()
{
    return 100;
}
```

Calling:

```java
int num = getNumber();
```

---

# 4. Parameters and Return Value

```java
static int add(int a, int b)
{
    return a + b;
}
```

Calling:

```java
int ans = add(10,20);
```

Output:

```text
30
```

---

# Return Statement

The `return` keyword:

1. Returns a value.
2. Ends the execution of the method.

Example:

```java
static int square(int n)
{
    return n * n;
}
```

---

# Void Methods

```java
static void display()
{
    System.out.println("Hello");
}
```

`void` means:

```text
This method does not return anything.
```

---

# Method Calling

```java
greet();

int ans = add(10,20);
```

Syntax:

```java
methodName(arguments);
```

---

# Static Methods

```java
static void greet()
{
}
```

Static methods belong to the class.

Calling:

```java
Main.greet();
```

or inside same class:

```java
greet();
```

---

# Instance Methods

```java
class Student {

    void study()
    {
        System.out.println("Studying...");
    }
}
```

Calling:

```java
Student s = new Student();

s.study();
```

Instance methods belong to objects.

---

# Method Overloading

Same method name but different parameters.

```java
static int sum(int a, int b)
{
    return a + b;
}

static int sum(int a, int b, int c)
{
    return a + b + c;
}

static double sum(double a, double b)
{
    return a + b;
}
```

Java decides which method to call based on arguments.

---

# Method Signature

A method signature consists of:

```text
Method Name + Parameter List
```

Example:

```java
sum(int,int)

sum(double,double)
```

Return type is NOT part of the signature.

---

# Local Variables

Variables declared inside a method.

```java
static void test()
{
    int x = 10;
}
```

`x` exists only inside this method.

---

# Parameter Variables

```java
static void print(int num)
{
}
```

`num` exists only inside the method.

---

# Variable Scope

```java
static void test()
{
    int x = 10;
}
```

`x` cannot be accessed outside `test()`.

---

# Java is Pass By Value

Java always passes copies of values.

---

## Primitive Example

```java
static void change(int x)
{
    x = 100;
}

public static void main(String[] args)
{
    int a = 10;

    change(a);

    System.out.println(a);
}
```

Output:

```text
10
```

Reason:

A copy of `a` is passed.

---

## Array/Object Example

```java
static void change(int[] arr)
{
    arr[0] = 100;
}
```

Calling:

```java
int[] arr = {10,20,30};

change(arr);
```

Output:

```text
100
```

Reason:

A copy of the reference is passed.

Both references point to the same heap object.

---

# Memory Representation

```java
int[] arr = {10,20,30};

change(arr);
```

Memory:

```text
STACK

arr --------\
             \
              -----> [100,20,30]
             /
parameter ---/
```

---

# Recursion

A method calling itself.

Example:

```java
static void count(int n)
{
    if(n == 0)
        return;

    System.out.println(n);

    count(n - 1);
}
```

Calling:

```java
count(5);
```

Output:

```text
5
4
3
2
1
```

---

# Main Method

```java
public static void main(String[] args)
```

### Why `public`?

JVM needs to access it from outside the class.

### Why `static`?

JVM calls `main()` without creating an object.

### Why `void`?

`main()` does not return anything.

### Why `String[] args`?

Used to receive command-line arguments.

---

# Complete Example

```java
public class Main {

    static void greet()
    {
        System.out.println("Hello");
    }

    static int add(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        greet();

        int ans = add(10,20);

        System.out.println(ans);
    }
}
```

---

# Summary

```text
Method
↓
A block of code that performs a specific task.
```

### Types:

```text
1. No Parameters, No Return
2. Parameters, No Return
3. No Parameters, Return
4. Parameters, Return
5. Method Overloading
6. Recursive Methods
```

### Important Rules

```text
✓ Every method must belong to a class.
✓ Java does not support standalone functions.
✓ Java is always Pass By Value.
✓ Static methods belong to classes.
✓ Instance methods belong to objects.
✓ Methods improve code reusability.
```
