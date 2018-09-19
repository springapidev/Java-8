package com.coderbd.immutable;

public class Test {

    public static void main(String[] args) {
        Student student = new Student(101, "Mr. Trump");
        // System.out.println(student);        
        //System.out.println(student.displayDetails());
        student.displayDetails(student);

    }
}
