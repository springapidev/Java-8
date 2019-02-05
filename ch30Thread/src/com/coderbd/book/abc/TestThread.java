package com.coderbd.book.abc;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestThread extends Thread{
    public static void main(String[] args) {
        TestThread th=new TestThread();
        th.start();
        
    }
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(com.coderbd.book.ThreadAbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Sum: " + sum);
    }
}
