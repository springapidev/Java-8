package com.coderbd.abstration;
//abstract class can contain abstract method and non-abstract method
//abstract class can not be instantiated

public abstract class A {

    public int id;

    public String name;

    public A() {
    }

    public A(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
    
//abstract method means, it has no body

    public abstract void display();

    public void sayhello() {
        System.out.println("Hi....... How are you?");
    }

}
