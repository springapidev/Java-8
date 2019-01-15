package com.coderbd.objectcasting;

public class Test {

    public static void main(String args[]) {
        Animal creature;
        Cow daisy = new Cow();
        creature = daisy;        // OK
        creature = new Animal();
        //daisy = creature;     // Compile-time error, incompatible type
        // daisy = (Cow) creature;   // OK at Compile-time, but it throws exceptions at run time.

        if (creature instanceof Cow) {
            Cow cow = (Cow) creature;
            System.out.println(cow);
        }

        Dog dog = new Dog();
        creature = dog;

        Sultan sultan = new Sultan();
        daisy = sultan;
        creature = sultan;
        // sultan = creature;//compile time error
        // sultan = (Sultan) creature; // Runtime Error

    }
}
