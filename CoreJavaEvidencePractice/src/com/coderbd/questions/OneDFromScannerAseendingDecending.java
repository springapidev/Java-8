package com.coderbd.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OneDFromScannerAseendingDecending {
// Array Print Directly

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        Integer[] arr = new Integer[arraySize];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
        
    }
    
}
