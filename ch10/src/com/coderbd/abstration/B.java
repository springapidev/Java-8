package com.coderbd.abstration;
//A is Super class / parent class
// B is sub class / child class
// B gets all properties of A

public class B extends A {

    int age;

    public B() {
    }

    public B(int age) {
        this.age = age;
    }

    public B(int age, int id, String name) {
        super(id, name);
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println("hi...........I am from B.....");
    }

}
