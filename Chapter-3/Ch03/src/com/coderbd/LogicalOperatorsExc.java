package com.coderbd;

import java.util.Scanner;

public class LogicalOperatorsExc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
//program 1 for && operator
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        //program 2 for ||  operator
        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Yes 2");
        } else {
            System.out.println("No 2");
        }
        //program 3 for ^ operator
        if (num % 2 == 0 ^ num % 3 == 0) {
            System.out.println("Yes 3");
        } else {
            System.out.println("No 3");
        }
    }

}
