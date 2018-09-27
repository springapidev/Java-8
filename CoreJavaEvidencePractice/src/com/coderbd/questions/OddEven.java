package com.coderbd.questions;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isOddEven(sc.nextInt());
    }

    static void isOddEven(int num) {
        if (num == 0) {
            System.out.println(num + " is ZERO");
        } else {
            if (num % 2 == 0) {
                System.out.println(num + " is Even Number");
            } else {
                System.out.println(num + " is ODD Number");
            }
        }

    }

}
