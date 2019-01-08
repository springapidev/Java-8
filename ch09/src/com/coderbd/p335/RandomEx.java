package com.coderbd.p335;

import java.util.Random;

public class RandomEx {

    public static void main(String[] args) {
        Random random1 = new Random();
        System.out.println("From random1");
        for (int i = 0; i < 10; i++) {
            System.out.println(random1.nextInt(1000) + " ");
        }
        Random random2 = new Random(3);
        System.out.println("From random2");
        for (int i = 0; i < 1000; i++) {
            System.out.println(random2.nextInt(1000) + " ");
        }
    }

}
