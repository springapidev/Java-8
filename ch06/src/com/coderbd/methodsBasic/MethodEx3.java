package com.coderbd.methodsBasic;

public class MethodEx3 {

    public static void main(String[] args) {
// call void type method directly
        display();
        // call void type method Through Object of HIS Class
        MethodEx3 m = new MethodEx3();
        m.display2();
        m.display();
        //call Static Method Way-2
        MethodEx3.display();

    }

    public static void display() {
        System.out.println("I am Void Type");
    }

    public void display2() {
        System.out.println("I am Void Type 2");
    }

}
