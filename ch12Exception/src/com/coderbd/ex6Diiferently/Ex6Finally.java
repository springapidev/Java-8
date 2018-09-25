package com.coderbd.ex6Diiferently;

public class Ex6Finally {

    public static void main(String[] args) {
        System.out.println("1111111111111");

        try {
            System.out.println(10 / 10);
            System.out.println(Integer.parseInt("TEN"));
        } catch (ArithmeticException | NumberFormatException moly) {
            System.out.println("wow ki error");
        }
        System.out.println("2222222222222");

        System.out.println("3333333333333333333333333");

    }
}
