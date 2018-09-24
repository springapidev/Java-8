package com.coderbd.interfaces;

public class Fruit implements Edible {

    String nameOfFruit;

    public Fruit() {
    }

    public Fruit(String nameOfFruit) {
        this.nameOfFruit = nameOfFruit;
    }

    @Override
    public String howToEat() {
       return null;
    }

}
