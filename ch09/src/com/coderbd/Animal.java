package com.coderbd;
//Class is a blue print of Object

public class Animal extends Object{
//Animal Object's State
// Instance variable / class level variable, also can imagine Global Variable

    String name;
    String color;
    double age;
    String race;
// Default Constructor has no arguments/ parameters
    // 

    public Animal() {
    }
//argumentative constructor

    public Animal(String name, String colors, double age, String race) {
        //this means current instance
        this.name = name;
        color = colors;
        this.age = age;
        this.race = race;
    }

    //Animal Object's Behavior
    void bite() {
        System.out.println("Animal Can Bite");
    }

    void eat() {
        System.out.println("Animal Can eat");
    }

    void sleep() {
        System.out.println("Animal Can Sleep");
    }

    void run() {
        System.out.println("Animal Can run");
    }

    void walk() {
        System.out.println("Animal Can walk");
    }

    void bark() {
        System.out.println("Animal Can bark");
    }

   
    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", color=" + color + ", age=" + age + ", race=" + race + '}';
    }

}
