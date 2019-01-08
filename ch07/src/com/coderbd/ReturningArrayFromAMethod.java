package com.coderbd;

public class ReturningArrayFromAMethod {
// {2,4,6,7,8}

    public static void main(String[] args) {
        int[] li = {2, 4, 6, 7, 8};
        reverse(li);
        for (int p : reverse(li)) {
            System.out.print(p + ", ");
        }
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }
}
