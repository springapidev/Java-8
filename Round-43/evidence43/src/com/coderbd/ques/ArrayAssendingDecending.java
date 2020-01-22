package com.coderbd.ques;
//6.	Array Sorting ascending or descending order.

import java.util.Arrays;

public class ArrayAssendingDecending {

    public static void main(String[] args) {
        getArrayAseendingAndDecending(2, 1, 6, 5, 7, 9);
    }

    public static void getArrayAseendingAndDecending(int... arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
