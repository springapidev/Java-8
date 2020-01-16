package com.coderbd.p347;

public class PassObjectWithMethod {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student student = s1.getAStudent(0);
        System.out.println(student);
        s1.getDetails(student);
    }
}
