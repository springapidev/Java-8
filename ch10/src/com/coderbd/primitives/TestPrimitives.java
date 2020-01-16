package com.coderbd.primitives;

public class TestPrimitives {

    static Integer xy = new Integer(65);
    static int ixy = xy;
    static Integer ixy2 = ixy;
    static Integer ixy3 = new Integer(ixy2);
    String str1 = String.valueOf(ixy);

    int xyz = 100;
    Double dxy = new Double(20.0);
    String str2 = String.valueOf(dxy);
    Float fxy1 = new Float("25");
    Float fxy2 = new Float(20d);
    Float fxy3 = new Float(25.5f);
    String str3 = String.valueOf(fxy3);
    static Integer x = new Integer("1000");
    static int y = x;// y is not object or instance
    static int p = 15;
    static Integer q = p;
    Integer a = 5000;
    int b = a; // returns 5000
    String s1 = "10";
    int x1 = Integer.parseInt(s1);
    long x2 = Long.parseLong(s1);
    float x3 = Float.parseFloat(s1);
    double x4 = Double.parseDouble(s1);
    byte x5 = Byte.parseByte(s1);
    short x6 = Short.parseShort(s1);
    String s2 = "true";
    boolean x7 = Boolean.parseBoolean(s2);

    public static void main(String[] args) {
        System.out.println("xy: " + xy);
        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
        System.out.println(q);

        System.out.println("==========");
        System.out.println(q instanceof Integer);
        // System.out.println(p instanceof Integer); //wrong
        byte x1 = 1;
        Byte y1 = x1;
        byte z1 = y1;
        int p1 = z1;
        long p2 = p1;
        Long p22 = Long.parseLong(String.valueOf(p1));
        float p3 = p2;

        String s1 = String.valueOf(x1);
        int x2 = 10;
        Integer y2 = x2;
        short x3 = 100;
        Short y3 = x3;
        float x4 = 1000;
        Float y4 = x4;
        double x5 = 10000;
        Double y5 = x5;
        long x6 = 10000000;
        Long y6 = x6;
        char x7 = 'A';
        Character y7 = x7;
        boolean x8 = true;
        Boolean y8 = x8;
        boolean rs = s1 instanceof String;
        System.out.println(rs);

    }
}
