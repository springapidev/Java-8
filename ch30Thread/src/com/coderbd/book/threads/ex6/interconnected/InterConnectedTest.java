package com.coderbd.book.threads.ex6.interconnected;

public class InterConnectedTest {

    public static void main(String args[]) {

        Customer customer = new Customer();
        

        final Customer c = new Customer();
        System.out.println("Balance Before Withdrew: " + customer.amount);
        new Thread() {
            public void run() {
                c.withdraw(3000);
            }
        }.start();
   
        System.out.println("Balance After Withdrew: " + customer.balanceAfterWithdrew);
//        new Thread() {
//            public void run() {
//                c.deposit(6000);
//            }
//        }.start();
//        new Thread() {
//            public void run() {
//                c.deposit(2000);
//            }
//        }.start();

    }
}
