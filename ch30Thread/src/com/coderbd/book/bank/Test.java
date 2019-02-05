package com.coderbd.book.bank;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test extends Thread implements Runnable {

    private Person person;

    public Test(Person p) {
        this.person = p;
    }

    public static void main(String[] args) {

        Test ts1 = new Test(new Person("Minhaz"));
        ts1.start();
        Test ts2 = new Test(new Person("Shuvo"));
        ts2.start();
        Test ts3 = new Test(new Person("Rony"));
        ts3.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Account acc = Account.getAccount(person);
                acc.withdraw(100);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (acc.getBal() < 0) {
                    System.out.println("account is overdrawn!");
                }
                acc.deposit(200);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final Account balance is Tk." + Account.getBal());
    }
}
