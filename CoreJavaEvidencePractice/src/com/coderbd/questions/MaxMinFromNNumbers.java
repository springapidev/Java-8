package com.coderbd.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaxMinFromNNumbers {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Min: " + arr[0]
                + " Max: " + arr[arr.length - 1]);

    }
}
