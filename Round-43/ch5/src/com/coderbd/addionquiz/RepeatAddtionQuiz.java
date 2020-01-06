package com.coderbd.addionquiz;

import java.util.Scanner;

public class RepeatAddtionQuiz {

    public static void main(String[] args) {
        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Answer of n1 + n2?");
        int ans = sc.nextInt();
        while (n1 + n2 != ans) {
            System.out.println("Enter Answer of n1 + n2?");
            ans = sc.nextInt();
        }
        System.out.println("You have got it");
    }

}
