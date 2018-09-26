package com.coderbd.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneDFromScanner {
// Array Print Directly

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }

}
