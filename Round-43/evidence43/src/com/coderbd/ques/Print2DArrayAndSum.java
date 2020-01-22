package com.coderbd.ques;
//3.	Print an 2d Array and sum of the Array elements.

public class Print2DArrayAndSum {
    
    public static void main(String[] args) {
        int[][] arr = {
            {2, 7, 6},
            {1, 3}
        };
        print2DArrayAndGetSum(arr);
    }
        public static void print2DArrayAndGetSum(int[][] twoD) {
        int sum = 0;
        
        for (int[] oneD : twoD) {
            for (int num : oneD) {
                System.out.print(num + " ");
                sum += num;
            }
            System.out.println();
        }
        System.out.println("Sum is " + sum);
        
    }
}
