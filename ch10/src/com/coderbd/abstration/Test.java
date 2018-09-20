package com.coderbd.abstration;

public class Test {

    public static void main(String[] args) {
        B b = new B();
        // b.display();

        A a = new B();
        a.display();
        a.sayhello();

        // A aa=new A();//abstract class can not be instantiated
    }

}
