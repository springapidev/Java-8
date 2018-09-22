package com.coderbd.inheritance.ex3;

/**
 *
 * @author User
 */
public class B extends A {

    @Override
    public void sayHello() {
        System.out.println("Ghom from B");
    }

    public void sayHi() {
        super.sayHello();
        System.out.println("Hi, Israt, I am from B class, sayHi Method");
    }
}
