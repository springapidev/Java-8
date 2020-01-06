package com.coderbd.additionquiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        int x = 10;
        Integer i = x;
        int y = i;

        if (i instanceof Integer) {
            System.out.println("True");
        }

        int n1 = (int) (System.currentTimeMillis() % 10);
        int n2 = (int) (System.currentTimeMillis() / 7 % 10);
        Scanner sc = new Scanner(System.in);
        //  System.out.println("What is Addition of " + n1 + " + " + n2 + "?");
        System.out.println("Enter what are you thinking?");
        int ans = sc.nextInt();
        if (ans == (n1 + n2)) {
            System.out.println("Correct");
        } else {

            System.out.println("Incorrect, Because Correct Ans is " + (n1 + n2));
        }
    }

}
