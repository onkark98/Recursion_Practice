package org.example;

public class PrintNto1 {

    void f(int n)
    {
        if(n < 1)
            return;

        System.out.println(n);
        f(n-1);
    }

    public static void main(String[] args) {
        PrintNto1 obj = new PrintNto1();

        obj.f(10);
    }
}
