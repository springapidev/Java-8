package com.coderbd;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        if (num % 2 != 1) {
            System.out.println("Even Number");
        } else {
            System.out.println("ODD Number");
        }
    }
}
