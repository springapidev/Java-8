package com.coderbd;

import java.util.Arrays;

public class TakeInputArrayAndOutputArray {

    public static void main(String... args) {
        int arr[] = {2, 5, 7, 6};
        int[] callArr = getNewArray(arr);
        for (int i : callArr) {
            System.out.print(i + " ");
        }
        System.out.println("Variable length array");
        for (int j : getVariablelengthArray(3, 5, 8, 9, 7, 10, 5, 8, 5, 8, 54, 455, 454, 54, 1)) {
            System.out.print(j + " ");
        }
    }

    public static int[] getNewArray(int[] oldArr) {
        int[] newArr = new int[oldArr.length];
        System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
        return newArr;
    }

    public static void getNewArray(long[] oldArr) {

        for (long i : oldArr) {
            System.out.print(i + " ");
        }
    }

    public static int[] getVariablelengthArray(int... oldArr) {
        int[] newArr = new int[oldArr.length];
        System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
        Arrays.sort(newArr);
        return newArr;
    }
}
