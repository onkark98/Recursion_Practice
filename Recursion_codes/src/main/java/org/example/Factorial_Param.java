package org.example;

public class Factorial_Param {

    void f(int n, int pro) {

        if(n == 0)
        {
            System.out.println(pro);
            return;
        }
        f(n-1, pro * n);
    }

    public static void main(String[] args) {
        Factorial_Param obj = new Factorial_Param();

        obj.f(3, 1);

    }
}
