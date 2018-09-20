package com.coderbd.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Mehedee");
        Student s2 = new Student(2, "Jobayer");
        Student s3 = new Student(3, "Rekha");
        Student s4 = new Student(4, "Moly");
        List<Student> students = new ArrayList();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(new Student(5, "Arefin"));

        for (Student s : students) {
            System.out.println(s);
        }

    }
}
