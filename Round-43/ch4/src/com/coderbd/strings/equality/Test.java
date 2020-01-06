package com.coderbd.strings.equality;

public class Test {

    static String s1 = new String("HellO");
    static String s2 = new String("Hello");
    static int x = 10;
    static int y = 10;

    public static void main(String[] args) {
        System.out.println(s1 == s2);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(x == y);
    }

}
