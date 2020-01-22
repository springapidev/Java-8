package com.coderbd.ques;
//2.	Print an Array and sum of the Array elements.

public class ArraySum {

    public static void main(String[] args) {
        getArraySum(2, 8, 4, 1, 3, 6, 9);
    }

    public static void getArraySum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();
        System.out.println("Sum is " + sum);
    }

}
