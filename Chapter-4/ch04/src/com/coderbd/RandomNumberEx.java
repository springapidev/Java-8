package com.coderbd;

public class RandomNumberEx {

    public static void main(String[] args) {
        int singleDigitNumber = (int) (Math.random() * 10);
        System.out.println("Single Digit Number: " + singleDigitNumber);
        int twoDigitNumber = (int) (Math.random() * 100);
        if (twoDigitNumber > 9) {
            System.out.println("Two Digit Number: " + twoDigitNumber);
        } else {
            System.out.println("Two Digit Number: " + twoDigitNumber + 9);
        }
        int threeDigitNumber = (int) (Math.random() * 1000);
        System.out.println("Three Digit Number: " + threeDigitNumber);
        System.out.println("50 and 99: " +Math.round((50 + (Math.random() * 50))));

    }

}
