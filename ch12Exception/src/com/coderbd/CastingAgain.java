package com.coderbd;

public class CastingAgain {

    int x = Integer.MAX_VALUE;
    long y = x;
    //But.......
    int p = (int) y;// casting
    static long m = 8888888888888L;
    static int n = (int) m;
    static long rs = m % Integer.MAX_VALUE;

    // 8888888888888 % int Max = Result
    public static void main(String[] args) {
        System.out.println("n: " + n);
        System.out.println("rs: " + rs);
    }

}
