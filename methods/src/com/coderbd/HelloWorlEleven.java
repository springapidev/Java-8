package com.coderbd;

public class HelloWorlEleven {

    public static String sayHi(String s1, String s2) {
        String msg = s1 + s2;
        return msg;
    }

    public static String sayHi(int n1, int n2) {
        String msg = String.valueOf(n1) + String.valueOf(n2);
        return msg;
    }

    public static long sayHi(long n1, long n2) {
        long rs = n1 + n2;
        return rs;
    }
}
