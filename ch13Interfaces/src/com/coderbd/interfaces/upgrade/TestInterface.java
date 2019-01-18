package com.coderbd.interfaces.upgrade;

/*
Before Java 8, interfaces could have only abstract methods. The implementation of these methods has to be provided in a separate class. So, if a new method is to be added in an interface, then its implementation code has to be provided in the class implementing the same interface. To overcome this issue, Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes that implement the interface.

 */
// A simple program to Test Interface default 
// methods in java 
interface TestInterface {

    // abstract method 
    public void square(int a);

    // default method 
    default void show() {
        System.out.println("Default Method Executed");
    }
}

class TestClass implements TestInterface {

    // implementation of square abstract method 
    @Override
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String args[]) {
        TestClass d = new TestClass();
        d.square(4);

        // default method executed 
        d.show();
    }
}
