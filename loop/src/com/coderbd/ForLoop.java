package com.coderbd;

public class ForLoop {

    public static void printRangeByForLoop(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        makeSum(0.01, 100);
    }

    public static double makeSum(double currentValue, int count) {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += currentValue;
            currentValue += 0.01;
            System.out.println("Sum: " + sum + " i: " + i);
        }
        return sum;
    }
}
