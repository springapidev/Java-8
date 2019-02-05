package com.coderbd.book.threads.ex6.synchronization;

public class MyThread2 extends Thread{

    SynchronizationEx1 t;

    MyThread2(SynchronizationEx1 t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}
