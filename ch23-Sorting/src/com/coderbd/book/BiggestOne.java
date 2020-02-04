package com.coderbd.book;

import java.util.Scanner;

public class BiggestOne {

    public static void main(String[] args) {

        System.out.println("Big One: " + getBiggestOne());
    }

    public static int getBiggestOne() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int bigOne = num;
        while (num != -1) {
            num = sc.nextInt();
            if (bigOne < num) {
                bigOne = num;
            }
        }
        return bigOne;
    }
}
