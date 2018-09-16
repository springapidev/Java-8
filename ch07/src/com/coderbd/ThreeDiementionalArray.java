package com.coderbd;

public class ThreeDiementionalArray {

    public static void main(String[] args) {
        //twoDArray
        int x[][] = {
            {2, 3, 5, 6},
            {7, 8, 9},
            {1, 4, 7, 9}
        };
        //twoDArray
        int[][] y = {
            {2, 3},
            {1, 5, 9, 8, 7, 8}
        };

        int[][][] threeD = {
            {
                {2, 3, 5, 6},
                {7, 8, 9},
                {1, 4, 7, 9}
            },
            {
                {2, 3},
                {1, 5, 9, 8, 7, 8}
            }
        };

        for (int twoD[][] : threeD) {
            for (int oneD[] : twoD) {
                for (int i : oneD) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
