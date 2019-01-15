package com.coderbd.inheritance.ex3;

public class B extends A {

    @Override
    public void sayHello() {
        System.out.println("Ghom from B");
    }

    public void sayHi() {
        super.sayHello();
        System.out.println("Hi, Shuvo, I am from B class, sayHi Method");
    }
}
