package com.coderbd.methodsBasic;

public class MethodEx5 {

    double balance = 5000.0;

    public static void main(String[] args) {
        MethodEx5 m = new MethodEx5();
        boolean rs = m.checkBalance(4500.0);
        System.out.println("Result: " + rs);
    }

    public boolean checkBalance(double withdrew) {
        balance = balance - withdrew;
        if (balance >= 1000.0) {
            return true;
        }
        return false;
    }

}
