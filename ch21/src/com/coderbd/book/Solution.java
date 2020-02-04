package com.coderbd.book;

public class Solution {
    static int x = 20;
    static int y = 5;
    static int z = x * y;
    public static void main(String[] args) {
        /* this prints the wrong number because the symbol '*' is used instead of the
      '/'
         */
        System.out.println("20 divided by 5 is " + z);
    }
}
