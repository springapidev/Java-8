package com.coderbd.additionquiz;

import java.util.Scanner;

public class MathRandomEx {

    public static void main(String[] args) {
        int n1 = (int) (Math.random() * 100000);
        int n2 = (int) (Math.random() * 10);
        System.out.println("Guess What is n1 - n2 = ?" + n1 + " , " + n2);
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        if (ans == (n1 - n2)) {
            System.out.println(n1 + " - " + n2 + " = " + ans + ", So Correct");
        } else {
            System.out.println(n1 + " - " + n2 + " != " + ans + ", So InCorrect");
        }

    }
}
