package com.coderbd.book;

public class BubbleSort {

    /**
     * Bubble sort method
     */
    public static int[] bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            //   int[] list = {2, 9, 5, 4, 8, 1, 6};
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true; // Next pass still needed
                }
            }
        }
        return list;
    }

    /**
     * A test method
     */
    public static void main(String[] args) {
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
