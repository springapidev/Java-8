package com.coderbd.boxing;

public class BoxingTest {

    public static void main(String[] args) {
        // creating an Integer Object 
        // with value 10. 
        Integer i = new Integer(10);

        // unboxing the Object 
        int j = i;
        Integer p = j;

        System.out.println("Value of i: " + i);
        System.out.println("Value of i1: " + j);

        //Autoboxing of char 
        Character gfg = 'a';

        // Auto-unboxing of Character 
        char ch = gfg;
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + gfg);

    }
}
