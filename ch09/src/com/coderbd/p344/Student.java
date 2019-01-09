package com.coderbd.p344;

public class Student {

    private String name = "Sagor";

    public String color = "Green";

    private void sayHello() {
        System.out.println("Hello...");
    }

    private void sayHi() {
        System.out.println("Hi...");
    }

    public String getName() {
        return name;
    }

    public void passObject(Student s) {
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", color=" + color + '}';
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
