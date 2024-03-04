package org.example;

public class practice {

    public int f(int i)
    {
        if(i<=1)
        {
            return i;
        }

        return f(i-1 )+ f(i-2);
    }

    public static void main(String[] args) {
        practice obj = new practice();
        //int[] arr = {1,2,3,4,5,6};
        int i=3;
        int fibonacci;
        fibonacci = obj.f(i);
        System.out.println(fibonacci);
    }
}
