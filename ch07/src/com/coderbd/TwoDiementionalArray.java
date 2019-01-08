package com.coderbd;

public class TwoDiementionalArray {

    public static void main(String[] args) {
        //  int x[] = {2, 3, 5};//Single diementional
        // int y[] = {7, 8, 9};//Single diementional

        int twoD[][] = {
            {2, 3, 5, 6},
            {7, 8, 9},
            {1, 4, 7, 9}
        };
        System.out.println("twoD[2][1]:" + twoD[2][3]);

        for (int oneD[] : twoD) {
            for (int i : oneD) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        String[][] str2D = {
            {"A", "C"},
            {"F", "G"}
        };

        int[][] x = {
            {2, 3},
            {1, 5, 9, 8, 7, 8}
        };
    }
}
