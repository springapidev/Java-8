package com.coderbd.book;

public class PrimeNumberList {
    
    public static void main(String[] args) {
        getPrimeNumbers(2000);
    }
    
    public static void getPrimeNumbers(int num) {
        int i = 2;
        int count = 0;
        while (i <= num) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            i++;
        }
        
    }
    
    public static boolean isPrime(int num) {
        boolean status = true;
        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                status = false;
            }
            i++;
        }
        return status;
    }
}
