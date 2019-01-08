/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

/**
 *
 * @author User
 */
public class TestAnimal {
     public static void main(String[] args) {
        Animal tommy = new Animal();
        System.out.println("=====tommy==== "+tommy.name);
        //First Animal is Class Refernece
        //a1 is object name
        // = is operator
        // new is operator for creating Object
        // Last Animal is Constructor
        Animal jerry = new Animal();
        Animal animal500 = new Animal("Mr Nova", "Gray", 20.5, "ASIAN");
        System.out.println("==animal500== "+animal500.name+" Age: "+animal500.age);
        System.out.println(animal500);
        System.out.println(jerry);
         Animal animal2 = new Animal("Mr trum", "white", 40.5, "Western");
        System.out.println("==animal2== "+animal2.name+" Age: "+animal2.age);
        tommy.bite();
    }

}
