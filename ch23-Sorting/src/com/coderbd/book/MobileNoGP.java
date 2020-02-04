package com.coderbd.book;

import java.util.Random;

public class MobileNoGP {

    public static void main(String[] args) {
        int count = 0;
        for (int j = 0; j <= 9; j++) {
            for (int i = 1; i <= 999999; i++) {
                System.out.print("0171" + j + getRandomNumberString() + ", ");
                count++;
                if (count % 8 == 0) {
                    System.out.println();
                }

            }
            System.out.println("====================");
        }
    }

    public static String getRandomNumberString() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }
}
