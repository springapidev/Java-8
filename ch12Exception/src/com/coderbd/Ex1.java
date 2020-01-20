package com.coderbd;

public class Ex1 {

    static int x = 10;
    static int y = 2;
    static String str = "1000";

    public static void main(String[] args) {
        System.out.println("hiiiiiii");
        try {
            System.out.println(Integer.parseInt(str));
            System.out.println(x / y);
        } catch (NumberFormatException ne) {
            System.out.println("NumberFormatException..........");
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } finally {
            System.out.println("I am finally");
        }

        System.out.println("hellooooooooo.");

    }

}
