package com.coderbd.book.threads.ex6.interconnected;

public class Customer {

    int amount = 10000;
    int balanceAfterWithdrew;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");
        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
        }     
        this.amount -= amount;
        this.balanceAfterWithdrew = this.amount;
        System.out.println("balanceAfterWithdrew: "+this.balanceAfterWithdrew);
        System.out.println("withdraw completed...");
       
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit..." + amount);
        this.amount += amount;
        System.out.println("deposit completed... ");
        notify();
    }

//    synchronized void cancel() {
//        System.out.println("Transaction Cancel...");
//        notify();
//    }
}
