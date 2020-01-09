package com.coderbd;

public class LeanerSearch {

    public static void main(String[] args) {
        int[] x = {2, 5, 8, 9, 65, 47};
        searchArray(x, 100);

    }

    public static void searchArray(int[] arr, int key) {
        String rs = "Not Found";
        for (int i : arr) {
            if (i == key) {
                rs = "Found";
                break;
            }
        }
        System.out.println(rs);
    }
}
