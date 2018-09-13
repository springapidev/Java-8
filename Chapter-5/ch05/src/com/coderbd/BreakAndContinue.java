package com.coderbd;

public class BreakAndContinue {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i == 8) {
                break;
            }

        }
        System.out.println("" + i);

        ////////////////// continue/////////////////
        for (i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                if (i == 5 || i == 9) {
                    continue;
                }
                System.out.println("" + i);
            }
        }
    }

}
