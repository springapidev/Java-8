package com.coderbd;

import java.math.BigInteger;

public class PrimeNum {

    public static void main(String[] args) {
        int x[] = {1031, 5, 10, 7, 13, 21, 5201571, 88, 12014, 65487541, 654785654, 31, 33};
        checkPrime(x);
        isPrime(2);
    }
// way-1

    static void checkPrime(int[] numbers) {

        for (int number : numbers) {
            if (BigInteger.valueOf(number).isProbablePrime(1)) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }
// way-2

    static void isPrime(int number) {
        if (BigInteger.valueOf(number).isProbablePrime(1)) {
            System.out.print(number + " is Prime ");
        } else {
            System.out.print(number + " is Not Prime ");
        }
    }

}
