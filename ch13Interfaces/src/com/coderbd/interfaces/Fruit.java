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

    @Override
    public String howToJump() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String howToPlay() {
        return Edible.super.howToPlay(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String howToRun() {
        return Edible.super.howToRun(); //To change body of generated methods, choose Tools | Templates.
    }

}
