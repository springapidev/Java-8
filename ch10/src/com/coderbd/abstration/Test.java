package com.coderbd.abstration;

public class Test {

    public static void main(String[] args) {

        A a = new B();
        a.display();
        a.sayhello();

        A a2 = new C();
        a2.display();
        a2.sayhello();

        // A aa=new A();//abstract class can not be instantiated
    }

}
