package com.coderbd.book;

public class ManualSort {

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 6, 3};
        int[] sortedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int tempMin = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if (tempMin > arr[j]) {
                    tempMin = arr[j];
                }

            }
            sortedArr[i] = tempMin;
        }
        for (int k : sortedArr) {
            System.out.println(k + " ");
        }
    }

}
