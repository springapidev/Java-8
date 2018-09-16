package com.coderbd;

public class SingleDiementionalArray {

    public static void main(String[] args) {
        // Single diementional Array, one [] sign
        int p[] = {10, 25, 35, 23, 14, 32, 44, 91};//length 8
        // Index    0   1   2   3   4   5   6   7
        System.out.println("Lenth of p: " + p.length);
        //   System.out.println("p[5]: " + p[5]);
        for (int i : p) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Single diementional Array
        int q[] = {40, 55, 58, 61, 53, 73};
        //Index   0 1   2   3   4   5
        for (int j : q) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
