package com.coderbd.privateex.onn;

import com.coderbd.privateex.*;

public class Test {

    public static void main(String[] args) {
        EncapsulatedObjectEx obj = new EncapsulatedObjectEx();
        // obj.id = 100;// = 5000; //private varibale can not be accessed
        // obj.mayCar();
        // obj.mayPlane();
        // obj.myAxe();
        obj.getId();
        System.out.println("ID: " + obj.getId());
    }

}
