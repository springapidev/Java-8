package com.coderbd.basic.slide;

import java.util.Hashtable;

public class ArrayIndexing {

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 3};
        Hashtable h = new Hashtable();
        for (int i = 0; i < arr.length; i++) {
            h.put(i, arr[i]);
        }
        System.out.println("H: " + h);
        //H: {3=3, 2=20, 1=10, 0=5}
    }

}
