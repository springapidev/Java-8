package com.coderbd.interfaces.other;

/**
 *
 * @author Instructor
 */
public class Test {
private static Animal animal;

    public Test(Animal animal) {
        this.animal = animal;
    }


        
    public static void main(String[] args) {
        Dog d = new Dog();

        d.bark();
        Animal a = new Dog();
        a.bark();
       animal.bark();
        
    }
}
