package com.coderbd.primitives;

public class TestPrimitives {

    static Integer x = new Integer("1000");
    static int y = x;// y is not object or instance
    static int p = 15;
    static Integer q = p;

    Integer a = 5000;
    int b = a; // returns 5000

    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
        System.out.println(q);

        System.out.println("==========");
        System.out.println(x instanceof Integer);
        // System.out.println(p instanceof Integer); //wrong

    }
}
