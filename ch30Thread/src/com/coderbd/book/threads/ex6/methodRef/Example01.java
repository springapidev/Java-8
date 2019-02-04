package com.coderbd.book.threads.ex6.methodRef;

public class Example01 {

    public static void main(String[] args) {
        new Thread(Example01::doWork).start();
        new Thread(() -> doWork()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        }).start();
        new Thread(doSomeWork()).start();
    }

    static void doWork() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 50; i++) {
            System.out.printf("%s: %d%n", name, i);
            try {
                Thread.sleep((int) (Math.random() * 50));
            } catch (InterruptedException ie) {
            }
        }
    }

    static Runnable doSomeWork() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                for (int i = 0; i < 50; i++) {
                    System.out.printf("%s: %d%n", name, i);
                    try {
                        Thread.sleep((int) (Math.random() * 50));
                    } catch (InterruptedException ie) {
                    }
                }
            }
        };
        return r;
    }
}
