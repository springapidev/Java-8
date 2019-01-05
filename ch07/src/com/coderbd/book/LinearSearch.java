package com.coderbd.book;

public class LinearSearch {

    public static void main(String[] args) {
        int[] x = {4, 6, 5, 82, 71, 9, 75, 8, 45, 7, 18};
        System.out.println("Status: " + ispresentByLinearSearch(x, 175));
    }

    /**
     * The method for finding a key in the list
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }

    public static boolean ispresentByLinearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return true;
            }
        }
        return false;
    }
}
