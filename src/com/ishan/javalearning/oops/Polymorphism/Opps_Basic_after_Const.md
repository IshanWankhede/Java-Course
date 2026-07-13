# 3. `this` Keyword in Java

# What is `this`?

`this` is a reference variable that refers to the **current object**.

Memory:

```text
s1 ---------------------> Object1

Inside Object1 methods:

this -------------------> Object1
```

---

# Why is `this` Needed?

Example:

```java
class Student {

    String name;

    Student(String name) {
        name = name; // Wrong
    }
}
```

Both `name` refer to the parameter.

So object variable remains `null`.

Solution:

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}
```

Meaning:

```text
this.name → Object variable
name      → Parameter
```

---

# Uses of `this`

## 1. Access Current Object Variables

```java
this.name = name;
this.age = age;
```

---

## 2. Call Current Object Methods

```java
class Student {

    void display() {
        System.out.println("Hello");
    }

    void show() {
        this.display();
    }
}
```

Equivalent to:

```java
display();
```

Java automatically adds `this`.

---

## 3. Constructor Chaining

```java
class Student {

    Student() {
        System.out.println("Default");
    }

    Student(String name) {
        this();
        System.out.println(name);
    }
}
```

Output:

```text
Default
Ishan
```

Rule:

```text
this() must be the first statement.
```

---

## 4. Pass Current Object

```java
class Student {

    void test(Student s) {

    }

    void display() {
        test(this);
    }
}
```

---

## 5. Return Current Object

```java
class Student {

    Student getObject() {
        return this;
    }
}
```

Used in method chaining.

---

# Important Notes

```text
✓ this refers to current object.
✓ Cannot be used inside static methods.
✓ this itself is stored in stack.
✓ It stores address/reference of current object.
```

---

# Example

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(this.name);
    }
}
```

---

---

# 4. Static Keyword in Java

# What is Static?

`static` means:

```text
Belongs to the class rather than objects.
```

---

# Non Static Variables

```java
class Student {

    String name;
}
```

Each object gets its own copy.

Memory:

```text
s1 -----> name = Ishan
s2 -----> name = Rahul
```

---

# Static Variables

```java
class Student {

    static String college = "VIT";
}
```

Memory:

```text
Method Area

college = "VIT"
```

Only one copy exists.

All objects share it.

---

# Example

```java
Student s1 = new Student();
Student s2 = new Student();

System.out.println(Student.college);
```

---

# Static Methods

```java
class MathUtil {

    static int add(int a, int b) {
        return a + b;
    }
}
```

Calling:

```java
MathUtil.add(10,20);
```

No object required.

---

# Why is `main()` Static?

```java
public static void main(String[] args)
```

Because JVM calls it directly without creating an object.

---

# Rules of Static Methods

Static methods:

✅ Can access static members.

❌ Cannot directly access instance variables.

Example:

```java
class Student {

    int age;
    static int count;

    static void test() {

        System.out.println(count);

        // System.out.println(age); ❌
    }
}
```

Reason:

No object exists.

---

# Static Blocks

Used for static initialization.

```java
class Test {

    static {

        System.out.println("Executed");
    }
}
```

Runs only once when class loads.

Execution order:

```text
Static Block
↓
main()
```

---

# Static Nested Class

```java
class Outer {

    static class Inner {

    }
}
```

Can be created without outer object.

---

# Memory of Static Variables

```text
Method Area (Metaspace)

count = 10
college = "VIT"
```

Not stored inside objects.

---

# Summary of Static

```text
Object Members
↓
Separate copy for every object.

Static Members
↓
One copy shared by all objects.
```

---

---

# 5. Access Modifiers in Java

Access modifiers control visibility of variables, methods, and classes.

Java has four access modifiers.

---

# 1. private

Accessible only inside the same class.

```java
class Student {

    private int age;
}
```

---

# 2. Default (No Modifier)

```java
class Student {

    int age;
}
```

Accessible only inside the same package.

---

# 3. protected

Accessible:

```text
✓ Same package
✓ Child classes in other packages
```

---

# 4. public

Accessible from anywhere.

```java
public class Student {

}
```

---

# Access Table

| Modifier  | Same Class | Same Package | Child Class | Everywhere |
| --------- | ---------- | ------------ | ----------- | ---------- |
| private   | ✅          | ❌            | ❌           | ❌          |
| Default   | ✅          | ✅            | ❌           | ❌          |
| protected | ✅          | ✅            | ✅           | ❌          |
| public    | ✅          | ✅            | ✅           | ✅          |

---

# Example

```java
class Student {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
```

This is called **Encapsulation**.

---

# Class Access Modifiers

Top-level classes can only be:

```text
public
default
```

They cannot be:

```text
private ❌
protected ❌
```

---

# Example

```java
public class Main {

}
```

or

```java
class Main {

}
```

---

# Important Interview Points

### Can static methods use `this`?

❌ No.

Because `this` refers to an object, and static methods belong to the class.

---

### Can constructors be static?

❌ No.

Constructors are object-related.

---

### Can static variables be accessed using objects?

✅ Yes.

```java
s1.count;
```

But preferred way:

```java
Student.count;
```

---

# Summary

## `this`

```text
Refers to current object.
```

Uses:

```text
✓ Access current variables
✓ Call methods
✓ Constructor chaining
✓ Pass object
✓ Return object
```

---

## `static`

```text
Belongs to class, not objects.
```

Used for:

```text
✓ Shared variables
✓ Utility methods
✓ main()
✓ Static blocks
```

---

## Access Modifiers

```text
private   → Same class only
default   → Same package
protected → Package + Child classes
public    → Everywhere
```
