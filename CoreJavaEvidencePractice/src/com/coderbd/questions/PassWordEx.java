package com.coderbd.questions;

import java.util.Scanner;

public class PassWordEx {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String password = sc.nextLine();
        if (password.length() >= 7) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
