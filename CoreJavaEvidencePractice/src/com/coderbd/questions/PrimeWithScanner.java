package com.coderbd.questions;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeWithScanner {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isPrime(sc.nextInt());
    }
    
    static void isPrime(int number) {
        if (BigInteger.valueOf(number).isProbablePrime(1)) {
            System.out.print(number + " is Prime ");
        } else {
            System.out.print(number + " is Not Prime ");
        }
    }
}
