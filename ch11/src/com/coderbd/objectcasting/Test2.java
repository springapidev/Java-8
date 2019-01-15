package com.coderbd.objectcasting;

public class Test2 {

    public static void main(String[] args) {
        Animal creature;
        Cow daisy = new Cow();
        System.out.println(daisy); // prints: I am a Cow
        creature = daisy;        // OK
        Animal a = new Cow();
        System.out.println(creature); // prints: I am a Cow
        System.out.println(a); // prints: I am a Cow
        creature = new Animal();
        System.out.println(creature); // prints: I am a Animal
//    daisy = creature;     // Compile-time error, incompatible type
        if (creature instanceof Cow) {
            daisy = (Cow) creature;   // OK but not an instance of Cow
            System.out.println(daisy);
        }
    }

}
