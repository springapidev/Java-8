package com.coderbd.ex6;
public class Test extends Animal {
    public static void main(String[] args) {
        Test t = new Test();
        try {
             t.display();
        } catch (MyException e) {
            System.out.println("=========Ekto Problem============");
        }
       }
    @Override
    void display() {
        throw new MyException("Arithematic Exception."); //To change body of generated methods, choose Tools | Templates.
    }

}
