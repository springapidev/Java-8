package com.coderbd.polymorphism.runtime;

public class PolyTest {

    public static void main(String[] args) {
        Akbar a1 = new Akbar();
        a1.plugh();//Rice

        Akbar a2 = new Rahim();
        a2.plugh();// Wheat
        Rahim a3 = new Rahim();
        a3.plugh();//Wheat
    }

}
