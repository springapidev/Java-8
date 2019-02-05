package com.coderbd.book.threads.ex6.interconnected;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Customer1 {

    static int amount = 10000;
    static Thread tt = null;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");
     
        while (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
            wait();

            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
        System.out.println("Now Balance is: " + this.amount);
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit..." + amount);
        this.amount += amount;
        System.out.println("deposit completed... ");
        notify();
    }

    synchronized void cancel() {
        System.out.println("Transaction Cancel...");

    }

    public static void main(String args[]) {

        Customer1 customer = new Customer1();

        tt = new Thread() {
            public void run() {
                customer.withdraw(13000);
            }
        };
        tt.start();

        new Thread() {
            public void run() {
                customer.deposit(1000);
            }
        }.start();
//        new Thread() {
//            public void run() {
//                customer.deposit(3000);
//            }
//        }.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Customer1.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
