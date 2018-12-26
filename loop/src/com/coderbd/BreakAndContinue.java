package com.coderbd;

public class BreakAndContinue {

    public static void main(String[] args) {
        workWithContinue();
        workWithBreak();
    }

    public static void workWithContinue() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void workWithBreak() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
