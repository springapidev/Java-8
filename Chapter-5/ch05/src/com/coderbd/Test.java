package com.coderbd;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, max;
        System.out.println("Enter Note: ");
        number = input.nextInt();
        max = number;
        do {
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
        } while (number != 0);
        System.out.println(
                "max is "
                + max);
        System.out.println(
                "number "
                + number);
    }

}
