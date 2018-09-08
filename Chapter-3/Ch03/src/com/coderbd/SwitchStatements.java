package com.coderbd;

import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter An Input: ");
        int status = sc.nextInt();
        switch (status) {
            case 0:
                System.out.println("000000000");
                break;
            case 1:
                System.out.println("1111111");
                break;
            case 2:
                System.out.println("2222222");
                break;
            case 3:
                System.out.println("33333333");
                break;
            default:
                System.out.println("..........Default.......");

        }
    }
}
