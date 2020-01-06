package com.coderbd.addionquiz;

public class BreakContinue {

    public static void main(String[] args) {
        outerloop:
        for (int i = 1; i < 9; i++) {
            if (i <= 4) {
                continue outerloop;
            } else {
                innerloop:
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

        }
    }
}
