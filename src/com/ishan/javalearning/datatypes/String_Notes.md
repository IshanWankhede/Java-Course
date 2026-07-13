# Strings in Java - Complete Notes

# 1. What is a String?

A **String** is a sequence of characters.

Examples:

```java
String name = "Ishan";
String city = "Pune";
String message = "Hello World";
```

Unlike primitive datatypes (`int`, `double`, etc.), `String` is a **class** in Java.

```java
String name = "Ishan";
```

Internally it behaves like:

```java
String name = new String("Ishan");
```

---

# 2. String Declaration and Initialization

## Method 1 : Using String Literal

```java
String s1 = "Hello";
```

The string is stored inside the **String Pool**.

---

## Method 2 : Using `new`

```java
String s2 = new String("Hello");
```

A new object is created inside the Heap.

---

# 3. Memory Representation

## Example 1

```java
String a = "Hello";
String b = "Hello";
```

### Memory

```text
STACK

a --------\
           \
            -----> "Hello"
           /
b --------/

HEAP
└── String Pool
      └── "Hello"
```

### Important Points

* Only one `"Hello"` object is created.
* Java reuses the existing string from the pool.
* Saves memory.

---

## Example 2

```java
String a = new String("Hello");
```

### Memory

```text
STACK

a -------------------->

HEAP
--------------------------------
Object 1 : "Hello" (Heap Object)

String Pool
----------------
"Hello"
--------------------------------
```

### Important

Two objects are involved:

1. `"Hello"` inside String Pool.
2. New String object in Heap.

Therefore, `new String()` consumes extra memory.

---

# 4. Stack, Heap and String Pool

## Stack Stores

* Local variables
* References (addresses)
* Method calls

Example:

```java
String name = "Ishan";
```

```text
STACK
------
name → address
```

---

## Heap Stores

* Objects
* Arrays
* Collections
* String objects

---

## String Pool

A special memory area inside Heap.

Purpose:

* Avoid duplicate strings.
* Improve memory efficiency.
* Improve performance.

```text
HEAP
│
├── Objects
├── Arrays
└── String Pool
```

---

# 5. Important String Methods

---

## length()

Returns number of characters.

```java
String s = "Ishan";

System.out.println(s.length());
```

Output:

```text
5
```

---

## charAt()

Returns character at an index.

```java
System.out.println(s.charAt(0));
```

Output:

```text
I
```

---

## toUpperCase()

```java
System.out.println(s.toUpperCase());
```

Output:

```text
ISHAN
```

---

## toLowerCase()

```java
System.out.println(s.toLowerCase());
```

Output:

```text
ishan
```

---

## contains()

```java
String str = "I Love Java";

System.out.println(str.contains("Java"));
```

Output:

```text
true
```

---

## substring()

```java
String str = "Ishan";

System.out.println(str.substring(1,4));
```

Output:

```text
sha
```

---

## indexOf()

```java
System.out.println(str.indexOf('a'));
```

Output:

```text
2
```

---

## equals()

Compares actual values.

```java
String a = "Hello";
String b = "Hello";

System.out.println(a.equals(b));
```

Output:

```text
true
```

---

# 6. `==` vs `equals()`

## `==`

Compares memory addresses.

```java
String a = new String("Hello");
String b = new String("Hello");

System.out.println(a == b);
```

Output:

```text
false
```

---

## `equals()`

Compares actual content.

```java
System.out.println(a.equals(b));
```

Output:

```text
true
```

---

# 7. Strings are Immutable

Strings cannot be modified after creation.

Example:

```java
String str = "hello";

str.toUpperCase();

System.out.println(str);
```

Output:

```text
hello
```

Because a new string is returned.

Correct:

```java
str = str.toUpperCase();
```

---

# Memory Representation

```java
String str = "hello";

str = str.toUpperCase();
```

```text
String Pool

"hello"
"HELLO"
```

The old string remains until garbage collected.

---

# 8. Taking Input

```java
Scanner sc = new Scanner(System.in);

String name = sc.nextLine();
```

---

## Difference Between `next()` and `nextLine()`

### next()

Reads only one word.

Input:

```text
Ishan Sharma
```

Output:

```text
Ishan
```

---

### nextLine()

Reads complete line.

Output:

```text
Ishan Sharma
```

---

# Java String vs C++ String

| Feature                         | Java String | C++ String                                           |
| ------------------------------- | ----------- | ---------------------------------------------------- |
| Type                            | Class       | Class (`std::string`)                                |
| Mutable                         | ❌ Immutable | ✅ Mutable                                            |
| String Pool                     | ✅ Yes       | ❌ No                                                 |
| `==` compares values?           | ❌ No        | ✅ Yes                                                |
| Internal Memory Optimization    | String Pool | Small String Optimization (implementation dependent) |
| Can modify characters directly? | ❌ No        | ✅ Yes                                                |

---

# Example

## C++

```cpp
string s = "hello";

s[0] = 'H';

cout << s;
```

Output:

```text
Hello
```

---

## Java

```java
String s = "hello";

s.charAt(0) = 'H';
```

Output:

```text
Compilation Error
```

Because Java Strings are immutable.

---

# Java Equivalent

```java
String s = "hello";

s = "H" + s.substring(1);

System.out.println(s);
```

Output:

```text
Hello
```

---

# C++ vs Java Memory

## C++

```cpp
string a = "Hello";
string b = "Hello";
```

Usually creates separate objects.

---

## Java

```java
String a = "Hello";
String b = "Hello";
```

Memory:

```text
STACK

a --------\
           \
            -----> "Hello"
           /
b --------/

String Pool
```

Only one object is created.

---

# Summary

```text
STACK
↓
Stores references.

HEAP
↓
Stores actual String objects.

STRING POOL
↓
Special area inside Heap that stores String literals.
```

### Important Points

1. String is a class (non-primitive).
2. Strings are immutable.
3. Use `equals()` instead of `==`.
4. String literals are stored in the String Pool.
5. `new String()` creates extra objects.
6. Java Strings are memory optimized using the String Pool.
