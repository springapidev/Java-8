package com.coderbd.ex3;

public class Ex3 {

    public static void main(String[] args) {

        System.out.println("Ok");
        try {
            System.out.println(10 / 0);
            System.out.println("After error");
            System.out.println(Integer.parseInt("TEN"));
        } catch (NumberFormatException ne) {
            System.out.println(":::Number format Exception:::");
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero");

        } finally {
            System.out.println("Finally..............");
        }

        System.out.println("Hiiiiiiii");
        try {
            System.out.println(Integer.parseInt("TEN"));
        } catch (NumberFormatException e) {
            System.out.println("Number format Exception");
        }

        System.out.println("Last point");

    }
}
