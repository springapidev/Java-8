package com.coderbd.inheritance;

public class A {

    int id;
    String name;
    byte color;

    // More than one constructor, so it is called Constructor Overloading
    public A() {
    }

    public A(int id) {
        this.id = id;
    }

    public A(String name) {
        this.name = name;
    }

    public A(byte color) {
        this.color = color;
    }

    public A(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public A(String name, byte color) {
        this.name = name;
        this.color = color;
    }

    public A(int id, byte color) {
        this.id = id;
        this.color = color;
    }

    public A(int id, String name, byte color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
//copy constructor

    public A(A a) {
        this.id = a.id;
        this.name = a.name;
        this.color = a.color;
    }

    public void sayhello() {
        System.out.println("Hi, How are you?");
    }
}
