package com.coderbd;

import java.util.Scanner;

public class PassFailSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        int status = 0;

        if (marks < 70) {
            status =0;
        } else {
            status = 0;
        }

        switch (status) {
            case 0:
                System.out.println("failed");
                break;
            case 1:
                System.out.println("Passed");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
