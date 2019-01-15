package com.coderbd.inheritance;

/*
B class is inherting A class,So
A is Super class and B is sub class OR
A is Parent class and B is child class
 */
public class B extends A {

    double salary;

    public B() {
        super();
    }

    public B(double salary) {
        this.salary = salary;
    }

    public B(int id, String name) {
        super(id, name);
    }

    public B(double salary, int id, String name) {
        super(id, name);
        this.salary = salary;
    }

    public B(double salary, int id, String name, byte color) {
        super(id, name, color);
        this.salary = salary;
    }

}
