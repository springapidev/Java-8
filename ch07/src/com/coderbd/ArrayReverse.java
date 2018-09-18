package com.coderbd;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int x[] = {5, 8, 7, 8, 15, 25, 78, 99, 11}; //Length 3   
        //Index    0  1  2
        Arrays.sort(x);
        int newArray[] = new int[x.length];
        int j = 0;
        for (int i = x.length - 1; i >= 0; i--) {
            //new Array[0] = x[2] First
            newArray[j] = x[i];
            j++;
        }

        for (int k : newArray) {
            System.out.print(k + " ");
        }
    }
}
