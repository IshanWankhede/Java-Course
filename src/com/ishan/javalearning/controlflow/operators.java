package com.ishan.javalearning.controlflow;

public class operators {
    public static void main(String[] args) {
        // ==========================
        // 1. Arithmetic Operators
        // ==========================
        int a = 10;
        int b = 3;

        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println("Modulus : " + (a % b));

        // ==========================
        // 2. Unary Operators
        // ==========================
        int x = 5;

        System.out.println("x : " + x);

        System.out.println("x++ : " + (x++)); // Post Increment
        System.out.println("After x++ : " + x);

        System.out.println("++x : " + (++x)); // Pre Increment

        System.out.println("x-- : " + (x--)); // Post Decrement
        System.out.println("After x-- : " + x);

        System.out.println("--x : " + (--x)); // Pre Decrement

        // Unary Minus
        int num = 10;
        System.out.println(-num);

        // Logical NOT
        boolean flag = true;
        System.out.println(!flag);

        // ==========================
        // 3. Assignment Operators
        // ==========================
        int n = 10;

        n += 5; // n = n + 5
        System.out.println("+= : " + n);

        n -= 2;
        System.out.println("-= : " + n);

        n *= 2;
        System.out.println("*= : " + n);

        n /= 2;
        System.out.println("/= : " + n);

        n %= 3;
        System.out.println("%= : " + n);

        // ==========================
        // 4. Relational Operators
        // ==========================
        int p = 10;
        int q = 20;

        System.out.println(p == q);
        System.out.println(p != q);
        System.out.println(p > q);
        System.out.println(p < q);
        System.out.println(p >= q);
        System.out.println(p <= q);

        // ==========================
        // 5. Logical Operators
        // ==========================
        boolean c1 = true;
        boolean c2 = false;

        System.out.println(c1 && c2); // AND
        System.out.println(c1 || c2); // OR
        System.out.println(!c1);      // NOT

        // ==========================
        // 6. Bitwise Operators
        // ==========================
        int m = 5; // 0101
        int k = 3; // 0011

        System.out.println(m & k); // AND
        System.out.println(m | k); // OR
        System.out.println(m ^ k); // XOR
        System.out.println(~m);    // NOT   ~x = -(x+1)

        // ==========================
        // 7. Shift Operators
        // ==========================
        int s = 8; // 1000

        System.out.println(s << 1); // Left Shift x << n is equivalent to multiplying x by 2^n
        System.out.println(s >> 1); // Right Shift x << n is equivalent to dividing x by 2^n
        System.out.println(s >>> 1); // Unsigned Right Shift

        // ==========================
        // 8. Ternary Operator
        // ==========================
        int age = 20;

        String result =
                (age >= 18) ? "Adult" : "Minor";

        System.out.println(result);

        // ==========================
        // 9. instanceof Operator
        // ==========================
        String str = "Hello";

        System.out.println(str instanceof String);

        // ==========================
        // 10. String Concatenation
        // ==========================
        String first = "Hello";
        String second = "Java";

        System.out.println(first + " " + second);
    }
}
