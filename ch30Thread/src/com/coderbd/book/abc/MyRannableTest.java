package com.coderbd.book.abc;

public class MyRannableTest {
    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();
        
        Thread t=new Thread(mr);
        t.start();
    }
}
