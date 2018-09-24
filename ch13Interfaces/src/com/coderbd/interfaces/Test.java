package com.coderbd.interfaces;

public class Test {

    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible) objects[i]).howToEat());
            }

            if (objects[i] instanceof Animal) {
                System.out.println(((Animal) objects[i]).sound());
            }
        }
/////////// Casting/////////////
        Animal t1 = new Tiger();
        Tiger t2 = new Tiger();
        Animal t3 = (Animal) t2;

    }
}
