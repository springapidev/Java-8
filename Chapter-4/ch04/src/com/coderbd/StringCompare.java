package com.coderbd;

public class StringCompare {

    public static void main(String[] args) {

        String str1 = "Bangladesh";
        String str2 = "BanglAdesh";
        ///////////Equality Check//////////
        if (str1 == str2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //way -2
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        ///////////CompareTo///////
        String s1 = "Abc";//Small
        String s2 = "abc";//Big

        if (s1.compareTo(s2) < 0) {
            System.out.println("less than Zero");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("Greater than Zero");
        } else if (s1.compareTo(s2) == 0) {
            System.out.println("equal to Zero");
        }
        if (s1.compareToIgnoreCase(s2) < 0) {
            System.out.println("less than Zero");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("Greater than Zero");
        } else if (s1.compareTo(s2) == 0) {
            System.out.println("equal to Zero");
        }
        /////////////////////// index//////////////
        String str = "aDahaka";
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.indexOf("a", 3));//start from 3 index
        System.out.println(str.indexOf("Z", 3));//start from 3 index
        System.out.println(str.lastIndexOf("a", 2));

        ///////////// Conversion
        String ss = "10";
        int i = Integer.valueOf(ss);
        System.out.println("I: " + i);
        double salary = 50000.0;
        String sal = String.valueOf(salary);
        long salLong = Long.valueOf(ss);
        boolean bool = true;
        String boo = String.valueOf(bool);
        char ch = 'A';
        String chr = String.valueOf(ch);
        double d = Double.valueOf(ss);

    }
}
