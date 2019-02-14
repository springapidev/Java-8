package com.coderbd.basic.slide;

public class HashEqualityCh {

    static String x = "10";
    static String y = "10";
    static Integer[] arr = {2, 8, 9, 4, 77, 99, 10};

    public static void main(String[] args) {
        System.out.println("X: " + x.hashCode());
        System.out.println("Y: " + y.hashCode());
         System.out.println("Y: " + arr.hashCode());
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
