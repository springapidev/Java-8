package com.coderbd.toweOfHanoi;

public class FactorialEx {
    
    public static void main(String[] args) {
        System.out.println(fakrul(4));
    }
    
    public static long fakrul(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fakrul(n - 1);
        }
    }
}
