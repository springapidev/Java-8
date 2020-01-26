package com.coderbd.ques.teod;
//3.	Print an 2d Array and Sort the elements.

import java.util.Arrays;

public class Print2DArraySort {

    public static void main(String[] args) {
        int[][] arr = {
            {2, 7, 6},
            {1, 3}
        };
        print2DArrayAndGetSum(arr);
    }

    public static void print2DArrayAndGetSum(int[][] twoD) {

        for (int[] oneD : twoD) {
            Arrays.sort(oneD);
            sortQuickly(oneD);// Sort
            for (int num : oneD) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

    public static void sortQuickly(int[] a) {
        DualPivotQuicksort.sort(a, 0, a.length - 1, null, 0, 0);
    }
}
