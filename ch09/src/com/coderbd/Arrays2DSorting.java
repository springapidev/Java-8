package com.coderbd;

import java.util.Arrays;

public class Arrays2DSorting {

    public static void main(String[] args) {
        int[][] arr2D = {
            {4, 8, 7, 1, 2, 3, 5},
            {11, 9, 55, 77, 12, 45}
        };

        for (int[] oneD : arr2D) {
            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.print(i + ", ");

            }
            System.out.println();
        }
    }

}
