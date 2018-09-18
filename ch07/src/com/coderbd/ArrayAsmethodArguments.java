package com.coderbd;

public class ArrayAsmethodArguments {

    public static void main(String[] args) {
        int x[] = {8, 6, 5, 89, 4, 8};
        //displayArray(x);
        transferArray(x);
        displayArray(transferArray(x));

    }

    public static void displayArray(int[] arr) {
        for (int rekha : arr) {
            System.out.print(rekha + " ");
        }
    }

    public static int[] transferArray(int[] sourceArray) {
        int[] targetArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        return targetArray;
    }
}
