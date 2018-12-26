package com.coderbd;

import java.util.Scanner;

/**
 *
 * @author Mohammad Rajaul Islam
 */
public class WhileLoop {

    public static void printFirstNumToSecondNum(int num1, int num2) {
        while (num1 <= num2) {
            System.out.println(num1);
            num1++;
        }
    }

    public static int makeSumFromFirstNumToSecondNum(int num1, int num2) {
        int sum = 0;
        while (num1 <= num2) {
            sum += num1;
            num1++;
        }
        return sum;
    }

    public static void workWithSentinelvalue(Scanner sc) {
        int sum = 0;
        int n1 = 1;
        while (true) {
            System.out.println("Enter Number " + n1 + " Time");
            int num1 = sc.nextInt();
            if (num1 != -1) {
                sum += num1;
                System.out.println("Sum: " + sum);
                n1++;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("GCD: " + findOutGcd(16, 24));
    }

    public static int findOutGcd(int n1, int n2) {
        int gcd = 1;//initial GCD
        int possibleGcd = 2;

        while (possibleGcd <= n1 && possibleGcd <= n2) {
            if (n1 % possibleGcd == 0 && n2 % possibleGcd == 0) {
                gcd = possibleGcd;
            }
            possibleGcd++;

        }

        return gcd;
    }
}
