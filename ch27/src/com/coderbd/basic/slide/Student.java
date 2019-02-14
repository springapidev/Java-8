package com.coderbd.basic.slide;

import java.util.Objects;

public class Student {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("S1: " + s1.hashCode());
        System.out.println("S2: " + s2.hashCode());

        Student st1 = new Student("Minhaj", 25);
        Student st2 = new Student("Minhaz", 25);
        System.out.println("St1: " + st1.hashCode());
        System.out.println("St2: " + st2.hashCode());

        Teacher t1 = new Teacher("Minhaz", 25);

        System.out.println(st1.equals(s1));
        System.out.println("t1: " + t1.hashCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return true;
    }

}
