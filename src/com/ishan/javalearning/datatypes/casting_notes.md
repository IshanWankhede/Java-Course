# Type Casting in Java

## What is Type Casting?

Type casting is the process of converting one datatype into another datatype.

There are two types of casting in Java:

1. **Implicit Casting (Widening Casting)**
2. **Explicit Casting (Narrowing Casting)**

---

# 1. Implicit Casting (Automatic/Widening)

Converting a smaller datatype into a larger datatype.

Java performs this conversion automatically because there is no data loss.

## Order of Automatic Conversion

```text
byte → short → int → long → float → double
                  ↘
                  char
```

---

## Example

```java
int num = 10;

double d = num;

System.out.println(d);
```

### Output

```text
10.0
```

---

## More Examples

```java
byte b = 10;

int x = b;

long l = x;

double d = l;
```

All of these conversions are automatic.

---

# Why is it called Widening?

Because we are moving from a smaller memory size to a larger memory size.

Example:

```text
int    → 4 bytes
double → 8 bytes
```

Since the larger datatype can easily store the smaller value, no explicit cast is needed.

---

# 2. Explicit Casting (Narrowing)

Converting a larger datatype into a smaller datatype.

Since data may be lost, Java requires us to cast manually.

---

## Syntax

```java
smallerDatatype variable = (smallerDatatype)value;
```

---

## Example

```java
double d = 99.99;

int num = (int)d;

System.out.println(num);
```

### Output

```text
99
```

The decimal part is removed.

---

# Data Loss Example

```java
int x = 130;

byte b = (byte)x;

System.out.println(b);
```

### Output

```text
-126
```

---

## Why?

Range of byte:

```text
-128 to 127
```

The value `130` cannot fit inside a byte.

Binary representation:

```text
130 = 10000010
```

Java keeps only the required bits, resulting in overflow.

This is called **Narrowing Conversion**.

---

# Character Casting

---

## char → int

Characters are internally stored using Unicode values.

```java
char ch = 'A';

int x = ch;

System.out.println(x);
```

### Output

```text
65
```

This conversion is automatic.

---

## int → char

```java
int x = 65;

char ch = (char)x;

System.out.println(ch);
```

### Output

```text
A
```

---

## Example

```java
char ch = 'a';

System.out.println((int)ch);
```

### Output

```text
97
```

---

# Integer Division Problem

## Example

```java
int a = 10;
int b = 3;

double ans = a / b;

System.out.println(ans);
```

### Output

```text
3.0
```

---

## Why?

Because:

```java
a / b
```

is performed as integer division first.

The result `3` is then stored as `3.0`.

---

## Correct Way

```java
double ans = (double)a / b;

System.out.println(ans);
```

### Output

```text
3.3333333333333335
```

---

# String to Primitive Conversion

---

## String → int

```java
String s = "123";

int x = Integer.parseInt(s);

System.out.println(x);
```

### Output

```text
123
```

---

## String → double

```java
String s = "99.99";

double d = Double.parseDouble(s);
```

---

## String → long

```java
String s = "1000";

long l = Long.parseLong(s);
```

---

# Primitive to String Conversion

---

## Using `String.valueOf()`

```java
int x = 100;

String s = String.valueOf(x);
```

---

## Shortcut Method

```java
String s = x + "";
```

---

# Casting Table

| Conversion     | Automatic? |
| -------------- | ---------- |
| byte → short   | ✅ Yes      |
| short → int    | ✅ Yes      |
| int → long     | ✅ Yes      |
| long → float   | ✅ Yes      |
| float → double | ✅ Yes      |
| double → int   | ❌ No       |
| long → int     | ❌ No       |
| int → short    | ❌ No       |
| int → byte     | ❌ No       |
| int → char     | ❌ No       |
| char → int     | ✅ Yes      |

---

# Memory Size of Primitive Types

| Datatype | Size    |
| -------- | ------- |
| byte     | 1 byte  |
| short    | 2 bytes |
| int      | 4 bytes |
| long     | 8 bytes |
| float    | 4 bytes |
| double   | 8 bytes |
| char     | 2 bytes |

---

# Example Program

```java
public class Main {

    public static void main(String[] args) {

        int a = 10;

        double d = a;

        System.out.println(d);

        double x = 99.99;

        int y = (int)x;

        System.out.println(y);

        char ch = 'A';

        int ascii = ch;

        System.out.println(ascii);

        int num = 66;

        char c = (char)num;

        System.out.println(c);
    }
}
```

### Output

```text
10.0
99
65
B
```

---

# Summary

## Implicit Casting

```text
Smaller Datatype
        ↓
Larger Datatype
```

Example:

```java
int x = 10;

double d = x;
```

No cast required.

---

## Explicit Casting

```text
Larger Datatype
        ↓
Smaller Datatype
```

Example:

```java
double d = 99.99;

int x = (int)d;
```

Manual cast required.

---

# Easy Rule to Remember

```text
byte → short → int → long → float → double
```

### Moving Right

```text
Automatic Casting ✅
```

### Moving Left

```text
Explicit Casting Required ✅
```

---

# Mnemonic

```text
Smaller → Bigger
= Widening (Automatic)

Bigger → Smaller
= Narrowing (Manual)
```
