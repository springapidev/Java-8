package com.coderbd.methodsBasic;

import java.util.Scanner;

public class MethodEx7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for X: ");
        int x = sc.nextInt();
        System.out.println("Enter value for Y: ");
        int y = sc.nextInt();
        MethodEx7 m = new MethodEx7();
        int rs = m.makeSum(x, y);
        System.out.println("Rs: " + rs);

        int bigSum = m.makeSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Rs BIg: " + bigSum);
    }

    public int makeSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int makeSum(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10) {
        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        return sum;
    }
}
