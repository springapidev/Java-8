package com.coderbd;

import java.util.Scanner;

public class NestedSwitchStatements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter An Input: ");
        int status = sc.nextInt();
        switch (status) {
            case 0:
                System.out.println("000000000");
                break;
            case 1:
                System.out.println("11111111");
                System.out.print("Enter An New Status: ");
                int newStatus = sc.nextInt();
                switch (newStatus) {
                    case 0:
                        System.out.println("0 Inner");
                        break;
                    case 1:
                        System.out.println("1 Inner");
                        break;
                    case 2:
                        System.out.println("2 Inner");
                        break;
                    case 3:
                        System.out.println("3 Inner");
                        for (int i = 1; i <= 10; i++) {
                            System.out.println("I: " + i);
                        }
                        break;
                    case 4:
                        System.out.println("4 Inner");
                        break;
                    default:
                        System.out.println("default inner");

                }
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
