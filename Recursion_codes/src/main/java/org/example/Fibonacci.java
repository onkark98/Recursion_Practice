package org.example;

//0, 1, 1, 2, 3, 5, 8, 13.....
public class Fibonacci {

    void f(int i, int n)
    {
        if(i > n)
            return;

        System.out.println(i);
        f(i+1, n);
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        int n = 10;
        obj.f(0,n);
    }

}
