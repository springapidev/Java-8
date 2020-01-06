package com.coderbd.additionquiz;

import java.util.Scanner;

public class EvenBooean {

    public static void main(String[] args) {
        boolean even = false;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0) {
            even = true;
        }

        if (even) {
            if (even) {
                System.out.println("Yes Even Number");
            } else {
                System.out.println("Not Even Number");
            }
        } else {
            System.out.println("No, Not Even Number");
        }

    }
}
