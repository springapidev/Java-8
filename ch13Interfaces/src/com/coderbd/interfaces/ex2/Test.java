package com.coderbd.interfaces.ex2;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.eat();
        Animal dog2 = new Dog();
        Animal cat2 = new Cat();
        Object o = new Dog();
        Animal dooog = (Animal) o;//Casting

        Object[] objs = {new Dog(), new Cat()};
        for (int i = 0; i < objs.length; i++) {
            if (objs[i] instanceof Animal) {
                System.out.println(((Animal) objs[i]).eat());
            }
        }
        long x = 10;
        int y = (int) x;
    }
}
