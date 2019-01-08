package com.coderbd.p337;

public class StaticAnotherEx {

    static int x = 100;

    static {
        x = 100;
        System.out.println("block 1: " + x);
    }

    public StaticAnotherEx() {
        x = 500;
        System.out.println("I am deafult Constructor " + x);
    }

    public static void main(String[] args) {
        StaticAnotherEx sumaya = new StaticAnotherEx();
        x = 10000;
        System.out.println("I am from main method: " + sumaya.x);
    }

    static {
        x = 300;
        System.out.println("block 2: " + x);
    }

}
