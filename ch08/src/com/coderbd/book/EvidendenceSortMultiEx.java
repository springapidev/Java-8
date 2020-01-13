package com.coderbd.book;

import java.util.Arrays;

public class EvidendenceSortMultiEx {

    public static void main(String[] args) {
        int[][] arr2D = {
            {95, 81, 78, 3, 8, 7, 8, 77, 100},
            {915, 8, 78, 5, 18, 7, 8, 77, 100},
            {95, 118, 78, 7, 81, 7, 8, 177, 100}
        };

        for (int[] oneD : arr2D) {
            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
