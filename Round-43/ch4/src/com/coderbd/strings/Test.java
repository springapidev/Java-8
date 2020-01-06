package com.coderbd.strings;

public class Test {

    static String s1 = "Hello";
    static int x = 10;
    static int y = 11;

    public static void main(String[] args) {

        x = 11;
        System.out.println(System.identityHashCode(x));
        System.out.println("X: " + x);
        System.out.println(System.identityHashCode(y));

        System.out.println(System.identityHashCode(s1));
        s1.toUpperCase();
        System.out.println(s1);
        System.out.println(System.identityHashCode(s1));
        s1 = "Hello";
        System.out.println(s1);
        System.out.println(System.identityHashCode(s1));

        System.out.println("Woeolcomoe to Jaoa".lastIndexOf('o', 15));
    }

}
