package com.coderbd;

public class NewClass {

    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 99; i++) {
            sum += 1.0 * i / (i + 1);
        }
        System.out.println("Sum is " + sum);

        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= 1; j--) {
                System.out.print(j <= i ? j + " " : " " + " ");
            }
            System.out.println();
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                count++;
                System.out.println(i * j);
            }
        }
        System.out.println("Count: " + count);
    }

}
