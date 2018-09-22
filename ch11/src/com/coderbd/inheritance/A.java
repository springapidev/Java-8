package com.coderbd.inheritance;

public class A {

    int id;
    String name;
    String color;

    public A() {
    }

    public A(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public void sayhello() {
        System.out.println("Hi, How are you?");
    }
}
