package com.coderbd.book;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4};
        for (int i : insertionSort(arr)) {
            System.out.print(i + " ");
        }
    }

    /**
     * The method for sorting the numbers
     */
    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            /**
             * insert list[i] into a sorted sublist list[0..i-1] so that
             * list[0..i] is sorted.
             */
            //  int[] arr = {2, 9, 5, 4};
            int currentElement = list[i];
            System.out.println("Current: " + currentElement);
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
                System.out.println(k + 1 + " No Index =  " + list[k]);
            }

            // Insert the current element into list[k+1]
            list[k + 1] = currentElement;
            System.out.println(k + 1 + " No Index = " + currentElement);

        }
        return list;
    }
}
