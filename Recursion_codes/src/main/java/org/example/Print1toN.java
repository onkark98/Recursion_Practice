package org.example;

public class Print1toN {

    void f(int i, int n)
    {
        if(i > n)
            return;

        System.out.println(i);
        f(i+1, n);
    }

    public static void main(String[] args) {
        Print1toN obj = new Print1toN();
        int n = 10;
        obj.f(1,n);
    }
}
