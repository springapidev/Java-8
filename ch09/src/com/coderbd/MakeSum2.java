package com.coderbd;

import java.util.Scanner;

public class MakeSum2 {

    public static void main(String[] args) {

        System.out.println("" + makeSumm(3, 6, "*"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int fn = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int ln = sc.nextInt();
        System.out.println(makeSum(fn, ln));

    }

    public static int makeSum(int n1, int n2) {
        int sum = 0;
        if (n1 > 0 && n2 > 0) {
            if (n1 > n2) {//--
                for (int i = n1; i >= n2; i--) {
                    sum += i;
                }
            } else if (n1 < n2) {//++
                for (int i = n1; i <= n2; i++) {
                    sum += i;
                }

            } else if (n1 == n2) {
                sum = n1;
            }
        } else {
            sum = -1;
        }
        return sum;
    }

    public static int makeSumm(int n1, int n2, String str) {
        int rs = 0;
        if (str == "+") {
            rs = n1 + n2;
        } else if (str == "-") {
            rs = n1 - n2;
        } else if (str == "*") {
            rs = n1 * n2;
        } else if (str == "/") {
            rs = n1 / n2;
        } else if (str == "%") {
            rs = n1 % n2;
        }

        return rs;
    }
}
