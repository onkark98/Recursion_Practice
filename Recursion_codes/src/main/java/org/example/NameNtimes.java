package org.example;

public class NameNtimes {

    void f(int n, int count)
    {
        if(n==count)
            return;
        System.out.println("Onkar "+ n);
        f(n+1,count);
    }


    public static void main(String[] args) {

        NameNtimes obj = new NameNtimes();
        int count = 3;
        obj.f(0, count);
    }
}
