package com.coderbd.addionquiz;

public class NestedLoop {

    public static void main(String[] args) {
        int col = 1;
        System.out.print("    ");
        while (col <= 9) {
            System.out.print("  " + col);
            col++;
        }
        System.out.println("");
        System.out.println("--------------------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.print("  " + j);
            }
            System.out.println();
            System.out.println("-----------------------------------");
        }
    }
}
