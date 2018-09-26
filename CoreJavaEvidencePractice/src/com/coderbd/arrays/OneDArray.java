package com.coderbd.arrays;

import java.util.Arrays;
import java.util.Collections;

public class OneDArray {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 8, 6, 9};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        ///////////////======2=======///////////////////
        System.out.println("Sorter Array OR Assending Order");
        ////
        int[] a = {4, 2, 1, 8, 6, 9};
        Arrays.sort(a);
        for (int j : a) {
            System.out.print(j + " ");
        }
        ///////////////======3=======///////////////////
        System.out.println("Array decending Order");
        int[] b = {4, 2, 1, 8, 6, 9};
        Arrays.sort(b);
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");
        }
        ///////////////======4=======///////////////////
        System.out.println("Array decending Order using Reverse");
        Integer[] c = {4, 2, 1, 8, 6, 9};
        Arrays.sort(c);
        Collections.reverse(Arrays.asList(c));
        System.out.println("Modified Array : "
                + Arrays.toString(c));
    }

}
