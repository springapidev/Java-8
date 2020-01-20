package com.coderbd.inheritance;

public class Test {

    public static void main(String[] args) {
        B b1 = new B(); // b1 is object and its reference is B class
        A b2 = new B();//b2 is object and its reference is A class
        A a1 = new A();//a1 is object and its reference is A class
        ////////////BUT........../////////////////////
        // B a2 = new A();//wrong, child can not be reference of parent

        System.out.println(b1 instanceof A);
    }

}
