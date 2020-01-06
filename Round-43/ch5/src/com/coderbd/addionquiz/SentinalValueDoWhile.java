package com.coderbd.addionquiz;

import java.util.Scanner;

public class SentinalValueDoWhile {

//    {
//        int x = 10;//local variable
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        do {
            sum += n;
            System.out.println("Enter New Num, but sum? " + sum);
            n = sc.nextInt();

        } while (n != -1);
    }

}
