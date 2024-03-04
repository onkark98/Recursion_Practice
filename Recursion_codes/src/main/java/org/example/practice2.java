package org.example;

public class practice2 {

    int f(int i)
    {
        if(i==0||i==1)
            return i;

        return f(i-1) + f(i-2);

    }

    public static void main(String[] args) {
        practice2 obj = new practice2();
        int n=3;
        //int i=1;
        //int sum =0;
        int fact = obj.f(n);
        System.out.println(fact);
    }

}
