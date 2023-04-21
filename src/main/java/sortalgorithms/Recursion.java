package sortalgorithms;

import java.awt.*;

public class Recursion {

    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int factorial(int num) {
        if (num == 0)
            return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        for (int i = 0; i < 25; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
