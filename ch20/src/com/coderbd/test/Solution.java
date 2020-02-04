package com.coderbd.test;

public class Solution {

    public static void main(String[] args) {
        int list[] = {10, 20, 30, 40, 50, 60};

        for (int i = 1; i < list.length; i++) {
            list[i] = list[i - 1];
        }

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
