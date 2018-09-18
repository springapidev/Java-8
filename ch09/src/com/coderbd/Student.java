package com.coderbd;

public class Student {

    int id;
    String name;

    public Student() {
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1000);
        s1.setName("Mr. AAAAA");
        System.out.println(s1);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }

}
