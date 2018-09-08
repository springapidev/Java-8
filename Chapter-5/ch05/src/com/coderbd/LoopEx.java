package com.coderbd;

public class LoopEx {

    public static void main(String[] args) {
////////////////For Loop //////////////////
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("I: " + i);
            sum += i;
        }
        System.out.println("Sum: " + sum);

////////////////While Loop////////////////
        int sum2 = 0;
        int j = 1;
        while (j <= 10) {
            System.out.println("I: " + j);

            sum2 += j;
            j++;
        }
        System.out.println("Sum2: " + sum2);
        ////////////////Do While Loop////////////////
        int sum3 = 0;
        int k = 1;

        do {
            System.out.println("I: " + k);

            sum3 += k;
            k++;
        } while (k <= 10);
        System.out.println("Sum3: " + sum3);
    }
}
