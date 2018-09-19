package com.coderbd.immutable;

public final class Student {

    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

  

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }

    public Student displayDetails() {
        Student s = new Student(100, "Mr. BBBB");
        return s;

    }

    public void displayDetails(Student s) {
        System.out.println(s);
    }

}
