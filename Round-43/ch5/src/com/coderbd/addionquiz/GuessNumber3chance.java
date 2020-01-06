package com.coderbd.addionquiz;

import java.util.Scanner;

public class GuessNumber3chance {

    public static void main(String[] args) {
        int chance = 0;
        int num = 10 + (int) (Math.random() * 11);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Guess Num");
        int guessNum = sc.nextInt();
        while (num != guessNum) {
            chance++;

            if (guessNum > num) {
                System.out.println("too high");
            } else if (guessNum < num) {
                System.out.println("too low");
            } else {
                System.out.println("Your guess Num is " + num);
            }
            if (chance == 3) {
                System.out.println("You loss!");
                break;
            }
            guessNum = sc.nextInt();

        }
        if (num == guessNum) {
            System.out.println("Winner");
        } else {
            System.out.println("Your original Num is " + num);
        }

    }

}
