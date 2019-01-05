package com.coderbd.book;

public class InsertionSort {

    public static void main(String[] args) {
        double[] list = {28, 32, 37, 19, 86, 88, 6, 75, 49, 47};
        for (double x : insertionSort(list)) {
            System.out.print(x + ", ");
        }

    }

    /**
     * The method for sorting the numbers
     */
    public static double[] insertionSort(double[] list) {
        for (int i = 1; i < list.length; i++) {
            /**
             * insert list[i] into a sorted sublist list[0..i-1] so that
             * list[0..i] is sorted.
             */
            double currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];

            }

            // Insert the current element into list[k+1]
            list[k + 1] = currentElement;

        }
        return list;
    }
}
