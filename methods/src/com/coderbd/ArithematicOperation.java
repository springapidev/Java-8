package com.coderbd;

import java.util.Scanner;

public class ArithematicOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for num 1");
        int n1 = sc.nextInt();
        System.out.println("Enter value for num 2");
        int n2 = sc.nextInt();
        System.out.println("Enter value for mode ie: +,-,*,/,%");
     //  sc.nextLine();
        String m = sc.next();

        System.out.println(operateAll(n1, n2, m.trim()));
    }

    public static int operateAll(int num1, int num2, String mode) {
        int rs = 0;
        if (mode.equals("+")) {
            rs = add(num1, num2);
        } else if (mode.equals("-")) {
            rs = substruct(num1, num2);
        } else if (mode.equals("*")) {
            rs = multi(num1, num2);
        } else if (mode.equals("/")) {
            rs = divide(num1, num2);
        } else if (mode.equals("%")) {
            rs = mod(num1, num2);
        }
        return rs;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int substruct(int num1, int num2) {
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        return num1 % num2;
    }
}
