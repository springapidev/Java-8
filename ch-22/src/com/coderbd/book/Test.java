package com.coderbd.book;

public class Test {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 87, 78, 71, 79, 70, 88, 73, 8, 77, 82, 75, 8, 76};
        int searchNum = 76;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNum) {
                System.out.println("Found");
                break;
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
