package com.coderbd.polymorphism.runtime;

public class Test {

    public static void main(String[] args) {
        Animal a1 = new Horse();
        a1.sound();
        Animal a2 = new Cat();
        a2.sound();
    }

}
