package com.coderbd;

public class Ex1 {

    static int x = 10;
    static int y = 0;
    static String str = "TEN";

    public static void main(String[] args) {
        System.out.println("hiiiiiii");
        try {
            System.out.println(Integer.parseInt(str));
            System.out.println(x / y);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("hellooooooooo.");

    }

}
