package com.coderbd.boxing;

public class TypeConversionEx {

    public static void main(String[] args) {
        int x = 10;
        long y = x;
        int z = (int) y;// type casting
        //////type Conversion
        String s = "100";
        int i = Integer.parseInt(s);
        System.out.println(i);

    }

}
