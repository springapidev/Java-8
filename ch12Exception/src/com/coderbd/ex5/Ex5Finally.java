package com.coderbd.ex5;

public class Ex5Finally {

    public static void main(String[] args) {
        System.out.println("1111111111111");

        try {
            System.out.println(10 / 0);
            System.out.println(Integer.parseInt("TEN"));
        } catch (ArithmeticException ae) {
            System.out.println("You can not divide by zero");
        } catch (NumberFormatException e) {
            System.out.println("You can not parse TEN, FIVE etc");
        } finally {// finally block always execute
            System.out.println("Need Client Side validation");
        }

        System.out.println("2222222222222");

        System.out.println("3333333333333333333333333");

    }
}
