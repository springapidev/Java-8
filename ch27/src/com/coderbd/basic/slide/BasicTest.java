package com.coderbd.basic.slide;

public class BasicTest {

    static Integer x = 10;
    static Integer y = 20;
    static Integer p = 30;
    static Integer q = 40;

    static Integer r = new Integer(10);

    static String str1 = "Sheto";
    static String str2 = "Shetu";

    public static void main(String[] args) {
        System.out.println("X: " + x.hashCode());
        System.out.println("Y: " + y.hashCode());
        System.out.println("P: " + p.hashCode());
        System.out.println("Q: " + q.hashCode());
        System.out.println("R: " + r.hashCode());
        System.out.println("1 << 30: " + (1 << 30));
        System.out.println("2^30: "+(2^30));
        System.out.println(x.equals(r));

        System.out.println("str1: " + str1.hashCode());
        System.out.println("str2: " + str2.hashCode());

        System.out.println(str1.equals(str2));

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

}
