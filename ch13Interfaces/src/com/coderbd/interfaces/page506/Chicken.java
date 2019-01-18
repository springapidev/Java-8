package com.coderbd.interfaces.page506;

public class Chicken extends Animal implements Edible {

    @Override
    public String sound() {
        return "Chicken: Cock a doodle do";
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }
}
