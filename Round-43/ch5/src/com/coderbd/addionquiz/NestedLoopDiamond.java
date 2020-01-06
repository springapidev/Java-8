package com.coderbd.addionquiz;

public class NestedLoopDiamond {

    public static void main(String[] args) {
        /*
        *
        **
        ***
        **
        *
         */
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int p = 15; p > 0; p--) {
            for (int q = 1; q <= p; q++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
