package org.example;

public class Factorial_Functional {

    int f(int n) {
        if (n <= 0)
            return 1;

        return n * f(n - 1);

    }

    public static void main(String[] args) {
        Factorial_Functional obj = new Factorial_Functional();

        int i = obj.f(3);
        System.out.println(i);
    }
}
