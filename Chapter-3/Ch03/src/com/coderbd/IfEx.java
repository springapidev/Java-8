package com.coderbd;

public class IfEx {

    public static void main(String[] args) {
        boolean status = true;

        if (status) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        int number = 30;
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }
        else if (number % 5 == 0) {
            System.out.println(number + " is multiple of 5");
        }
    }
}
