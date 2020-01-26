package com.coderbd.ques;
//3.	Print an 2d Array and Sort the elements.

import java.util.Arrays;

public class Print2DArraySort {

    public static void main(String[] args) {
        Integer[][] arr = {
            {2, 7, 6},
            {1, 3}
        };
        print2DArrayAndGetSum(arr);
    }

    public static void print2DArrayAndGetSum(Integer[][] twoD) {

        for (Integer[] oneD : twoD) {
            sort(oneD);// Sort
            for (int num : oneD) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

}
