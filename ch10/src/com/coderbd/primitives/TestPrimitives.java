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
