package com.coderbd.additionquiz;

public class FloatingPointNumberComparingEx {

    public static void main(String[] args) {
        double x = 10.0 / 3;
        System.out.println(Math.abs(x));
        if (Math.abs(x) == 3) {
            System.out.println("Ok");
        }
    }
}
