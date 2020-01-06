package com.coderbd.addionquiz;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int num = 10 + (int) (Math.random() * 91);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Guess Num");
        int guessNum = sc.nextInt();
        while (num != guessNum) {
            if (guessNum > num) {
                System.out.println("too high");
            } else if (guessNum < num) {
                System.out.println("too low");
            } else {
                System.out.println("Your guess Num is " + num);
            }
            guessNum = sc.nextInt();

        }
        System.out.println("Your guess Num is " + guessNum);
    }

}
