package com.coderbd.book;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] x = {4, 6, 5, 82, 71, 9, 75, 8, 45, 7, 18};
        System.out.println("Index: " + binarySearch(x, 82));
        System.out.println("Status: " + isPresent(x, 182));
    }

    /**
     * Use binary search to find the key in the list
     */
    public static int binarySearch(int[] list, int key) {
        Arrays.sort(list);
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return low - 1; // Now high < low
    }

    public static boolean isPresent(int[] list, int key) {
        Arrays.sort(list);
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            }else if (key > list[mid]) {
                low = mid + 1;
            }else if (key == list[mid]) {
                return true;
            }
        }
        return false;
    }
}
