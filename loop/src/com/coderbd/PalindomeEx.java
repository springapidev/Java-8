package com.coderbd;

import java.math.BigInteger;

public class PalindomeEx {

    public static void main(String[] args) {

        System.out.println(PalindomeEx.isPalindome("moam"));
        System.out.println("Is Prime: " + isPrime(10));
        checkPrimeNumbers(1, 100);
    }

    public static boolean isPalindome(String s) {
        boolean palindome = false;
        if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) {
            palindome = true;
        }
        return palindome;
    }

    public static void checkPrimeNumbers(int n1, int n2) {
        while (n1 <= n2) {
            if (isPrime(n1)) {
                System.out.println(n1 + " is prime? " + isPrime(n1));
            }
            n1++;
        }
    }

    public static boolean isPrime(int num) {
        boolean prime = false;
        if (new BigInteger(String.valueOf(num)).isProbablePrime(num)) {
            prime = true;
        }
        return prime;
    }
}
