package com.coderbd;

import java.math.BigInteger;

public class FactorialEx {

    public static void main(String[] args) {
        getFactorials(1020);
       
    }
//
    static void getFactorials(int n) {
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));// f= f * i
        }
        System.out.println(f);
    }

    static void getFactorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
    }

}
