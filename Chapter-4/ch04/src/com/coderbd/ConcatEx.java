package com.coderbd;

import java.util.Scanner;

public class ConcatEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        String s4 = s1 + s2 + s3;
        System.out.println("3 String: " + s1.concat(s2).concat(s3));
        System.out.println("S4: " + s4);

    }

}
