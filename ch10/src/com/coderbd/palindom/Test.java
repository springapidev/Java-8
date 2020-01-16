package com.coderbd.palindom;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //  System.out.println(isPalindome("mom"));
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        double d = input.nextDouble();
        Math.pow(2, 3);
        double dd = 1 / 2;
        System.out.println("dd: " + dd);
        System.out.println(Math.pow(4, dd));
    }

    static boolean isPalindome(String str) {
        boolean status = false;
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if (str.equalsIgnoreCase(sb.toString())) {
            status = true;
        }
        return status;
    }
}
