package com.coderbd.inheritance.ex3;

public class Test {

    public static void main(String[] args) {
        A a = new A();
        B b1 = new B();
        A b2 = new B();

        ///////Now call Methods/////////////
        a.sayHello();
        b1.sayHello();
        b2.sayHello();
        b1.sayHi();
        
    }
}
