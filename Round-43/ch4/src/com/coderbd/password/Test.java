package com.coderbd.password;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pass with Capital+Small+Digit");
        String pass = sc.nextLine();
        System.out.println(pass);

        boolean capitalStatus = false;
        boolean smallStatus = false;
        boolean digitStatus = false;
        boolean otherStatus = false;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isLetter(pass.charAt(i))) {
                char c = pass.charAt(i);

                if (String.valueOf(c).toUpperCase().equals(String.valueOf(pass.charAt(i)))) {
                    capitalStatus = true;

                }
                if (String.valueOf(c).toLowerCase().equals(String.valueOf(pass.charAt(i)))) {
                    smallStatus = true;
                }

            } else if (Character.isDigit(pass.charAt(i))) {
                digitStatus = true;
            } else {
                otherStatus = true;
            }
        }

        System.out.println("Capital Letter: " + capitalStatus + " Small letter: " + smallStatus + " Digit: " + digitStatus + " WildCard: " + otherStatus);

    }

}
