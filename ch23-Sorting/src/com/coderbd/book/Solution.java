/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.book;

/**
 *
 * @author User
 */
public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7,6, 8, 2,3,4};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        java.util.Arrays.sort(A);
        int num = 0;
        outer:
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                int n = 0;
                inner:
                for (int j = 1; j < A.length; j++) {

                    if (num > A[0]) {
                        continue outer;
                    }
                    if (A[j] - A[i + n] > 1) {
                        num = A[i + n] + 1;
                        continue inner;
                    }
                    n++;
                }

            }

        }
        return num;
    }
}
