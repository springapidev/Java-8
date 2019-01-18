package com.coderbd.interfaces.upgrade;

public interface TestInterfaceWithStaticmethod {

    // abstract method 
    public void square(int a);

    // static method 
    static void show() {
        System.out.println("Static Method Executed");
    }

   
}

class TestClassx implements TestInterfaceWithStaticmethod {

    // Implementation of square abstract method 
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String args[]) {
        TestClass d = new TestClass();
        d.square(4);

        // Static method executed 
        TestInterfaceWithStaticmethod.show();
    }
}
