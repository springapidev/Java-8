package com.coderbd.ex4;

public class Ex4Multicatch {

    public static void main(String[] args) {
        System.out.println("1111111111111");

        try {
            System.out.println(10 / 0);
            System.out.println(Integer.parseInt("TEN"));
        } catch (ArithmeticException ae) {
            System.out.println("You can not divide by zero");
        } catch (NumberFormatException e) {
            System.out.println("You can not parse TEN, FIVE etc");
        }

        System.out.println("2222222222222");

        System.out.println("3333333333333333333333333");

    }
}
