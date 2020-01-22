package com.coderbd.interfaces;

public interface Edible {

    double PI = 3.1416;

    String howToEat();// By default it is abstract method and public, so it has no body

    String howToJump();

    default String howToPlay() {
        return null;
    }

    default String howToRun() {
        return null;
    }

    static String howToSing() {
        return null;
    }
}
