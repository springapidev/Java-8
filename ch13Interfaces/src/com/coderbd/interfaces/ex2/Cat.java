package com.coderbd.interfaces.ex2;

public class Cat implements Animal {

    public Cat() {
        System.out.println("Cat Default Constructor");
    }

    @Override
    public String eat() {
        return "Cat, Cat can eat";
    }

}
