package com.coderbd.addionquiz;

import java.util.Scanner;

public class PalindomeEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenText = sc.next();
        StringBuilder sb = new StringBuilder(givenText);
        sb.reverse();
        boolean isPlaindom = sb.toString().equalsIgnoreCase(givenText) ? true : false;
        System.out.println(isPlaindom);
    }

}
