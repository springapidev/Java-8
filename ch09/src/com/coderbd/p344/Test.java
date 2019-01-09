package com.coderbd.p344;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.color);
        System.out.println(student.getName());
        Student stu = new Student();
        stu.color = "Red";
        stu.setName("Rony");
        student.passObject(stu);

    }
}
