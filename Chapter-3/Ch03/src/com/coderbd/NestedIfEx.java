package com.coderbd;

import java.util.Scanner;

public class NestedIfEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lucky Number between 500 and 1000: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            num += 150;
            if (num % 5 > 2) {
                num += 200;
            } else {
                num -= 200;
            }

        } else {
            num -= 500;
            num += 200;
            if (num % 3 < 2) {
                num += 500;
            }
        }
        System.out.println("Total Score: " + num);
int x=10;
        boolean status = true;
        if (status == true) {
            System.out.println("True");
        }
        
         if (status) {
            System.out.println("True");
        }
         
         if(x > 25){
         }
    }

}
