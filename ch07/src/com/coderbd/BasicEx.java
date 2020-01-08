package com.coderbd;

import java.util.Arrays;
import java.util.Scanner;

public class BasicEx {

    public static void main(String[] args) {
        int[] x = {2, 13, 4, 5};
        System.out.println(Arrays.toString(x));
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 0; j < x.length; j++) {
            System.out.print(x[j] + " ");
        }

        System.out.println("x[2] " + x[2]);

        //////////////////
        int[] y = new int[10];
        System.out.println(Arrays.toString(y));
        for (int j = 0; j < y.length; j++) {
            y[j] = j;
        }
        for (int j = 0; j < y.length; j++) {
            System.out.print(y[j] + " ");
        }
        int[] z = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int h = 0; h < z.length; h++) {
            z[h] = sc.nextInt();
        }
        Arrays.sort(z);
        for (int j = 0; j < z.length; j++) {
            System.out.print(z[j] + " ");
        }
    }

}
