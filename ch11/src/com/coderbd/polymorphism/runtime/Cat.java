package com.coderbd.polymorphism.runtime;

public class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
    public static void main(String args[]){
    	Animal obj = new Cat();
    	obj.sound();
    }
}