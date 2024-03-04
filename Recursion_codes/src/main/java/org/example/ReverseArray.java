package org.example;

import java.util.Arrays;

public class ReverseArray {
    int temp = 0;
    void f(int arr[], int p1, int p2)
    {
        if(p1>p2)
            return;
        temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
        f(arr, p1+1, p2-1);
    }

    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        obj.f(arr, 0 , n-1);
        System.out.println(Arrays.toString(arr));
    }
}
