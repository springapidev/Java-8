package com.coderbd.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddNums {

    static List<Integer> listOdds = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        getOdds(num);
        System.out.println();
        getEvens(num);
        System.out.println();
        getDivisibleBy5(num);
        System.out.println();
    

    }

    public static void getDivisibleBy5(int n) {
        for (int i = 1; i <= n; i++) {
            if (isDivisibleBy5(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void getEvens(int n) {
        for (int i = 1; i <= n; i++) {
            if (!isOdd(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void getOdds(int n) {
        for (int i = 1; i <= n; i++) {
            if (isOdd(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isOdd(int num) {
        return (num % 2 != 0);
    }

    public static boolean isDivisibleBy5(int num) {
        return (num % 5 == 0);
    }
}
