package com.coderbd.questions;

import java.util.Scanner;

public class LargestNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        isLargestNumber(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    static void isLargestNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is Largest Number");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is Largest Number");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " is Largest Number");
        } else {
            System.out.println(n1 + ", " + n2 + ", " + n3 + " are all equal Numbers");
        }
    }
}
