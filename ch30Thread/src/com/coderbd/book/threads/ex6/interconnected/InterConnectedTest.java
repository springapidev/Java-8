package com.coderbd.book.threads.ex6.interconnected;

public class InterConnectedTest {

    public static void main(String args[]) {
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(1000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(5000);
            }
        }.start();

    }
}
