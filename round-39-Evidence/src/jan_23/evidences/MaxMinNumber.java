package jan_23.evidences;

import java.util.Scanner;

public class MaxMinNumber {

    public static void main(String[] args) {
        MaxAndMin();
    }
    
    public static void MaxAndMin(){
        
        System.out.println("Enter the value of length");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int a[] = new int[length];
        int max = 0;
        int min = 0;
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the value");
            a[i] = input.nextInt();

            if (i == 0) {
                max = a[i];
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            } else {
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}
