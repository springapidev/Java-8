package com.coderbd.oopthinking;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student(123456, "Sumaya", "0168600000", true, new Department(101, "Finance"));
        System.out.println(s1);
    }
}
