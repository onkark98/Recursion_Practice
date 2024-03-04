package org.example;

public class PrintNto1BT {

    void f(int i, int n)
    {
        if(i<n)
            return;
        f(i-1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        PrintNto1BT obj = new PrintNto1BT();
        int n = 1;
        obj.f(10,n);
    }
}
