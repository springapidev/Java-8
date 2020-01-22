package com.coderbd.ques;
//1.	Find out the conditional Sum until input (-1). 

import java.util.Scanner;

public class SumUntill {

    public static void main(String[] args) {
        System.out.println("Sum is " + getSum());
    }

    public static int getSum() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        while (num != -1) {
            sum += num;
            num = sc.nextInt();
        }
        return sum;
    }
}
