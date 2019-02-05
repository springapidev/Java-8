package com.coderbd.book.abc;

public class MyRannableTest {
    public static void main(String[] args) {               
        Thread t=new Thread(new MyRunnable());
        t.start();
    }
}
