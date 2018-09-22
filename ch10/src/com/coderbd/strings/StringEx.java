package com.coderbd.strings;

public class StringEx {

    static String s1 = new String("Welcome");
    static String s2 = "Welcome";
    static String replaceEx = "Welcome to Java Worldc";

    public static void main(String[] args) {
        System.out.println(s1.compareTo(s2));
        System.out.println(replaceEx.replace('c', 'k'));
        String newReplace = replaceEx.replace('c', 'k');
        System.out.println(newReplace.replace('o', 'a'));

        System.out.println(newReplace.replaceFirst("el", "DHAKA"));
    }

}
