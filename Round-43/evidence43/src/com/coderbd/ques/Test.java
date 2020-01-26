/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.ques;

/**
 *
 * @author Students
 */
public class Test {

    public static void main(String[] args) {
        int[][][] data = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}}
        };

        System.out.print(ttt(data[0]));
    }

    public static int ttt(int[][] m) {
        int v = m[0][0];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (v < m[i][j]) {
                    v = m[i][j];
                }
            }
        }

        return v;
    }
}
