package com.coderbd.questions;

import com.coderbd.*;
import java.util.Scanner;

public class SumButExitWithZero {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Please enter a Num: ");
        do {
            n = sc.nextInt();
            sum += n;
        } while (n != 0);// jodi 0 dei, then nicher line dorkar nei
        // sum += n; 
        System.out.println("Sum: " + sum);
    }
}
