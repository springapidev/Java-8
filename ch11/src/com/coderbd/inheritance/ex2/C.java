package com.coderbd.inheritance.ex2;

public class C extends B {

    String department;

    public C() {
    }

    public C(String department) {
        this.department = department;
    }

    public C(String department, double salary) {
        super(salary);
        this.department = department;
    }

    public C(String department, double salary, int id, String name, String color) {
        super(salary, id, name, color);
        this.department = department;
    }

}
