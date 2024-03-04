package org.example;

public class SumOfFirstNNumbers {

    int sumOf(int i, int N, int sum)
    {
        if(i>N)
            return sum;

        sum = sum + i;
        return sumOf(i+1, N, sum);
    }

    public static void main(String[] args) {
        SumOfFirstNNumbers obj = new SumOfFirstNNumbers();
        int N = 3, sum =0;
        int result = obj.sumOf(1,N, sum);
        System.out.println(result);
    }
}
