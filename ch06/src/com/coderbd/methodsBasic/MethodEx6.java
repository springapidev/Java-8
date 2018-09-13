package com.coderbd.methodsBasic;

public class MethodEx6 {

    int x = 10;
    int y = 5;

    public static void main(String[] args) {
        MethodEx6 m = new MethodEx6();
        int rs = m.makeSum(m.x, m.y);
        System.out.println("Rs: " + rs);
    }

    public int makeSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
