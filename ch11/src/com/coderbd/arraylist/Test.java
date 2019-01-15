package com.coderbd.arraylist;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List li = new ArrayList();
        li.add(new Integer(10000));
        li.add(new String("OK"));
        li.add(new com.coderbd.arraylist.Student(100, "Tahmina", 1));
        List<Student> list = new ArrayList();
        Student s1 = new Student(100, "Shuvo", 1);
        Student s2 = new Student(101, "Roney", 2);
        Student s3 = new Student(102, "Motin", 3);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(new Student(103, "Shetu", 4));
        list.add(new Student(104, "Minhaz", 5));
        list.add(new Student(105, "Yasin", 6));
        System.out.println("Size: " + list.size());

        for (Student s : list) {
            System.out.println(s.getId() + ", " + s.getName() + ", " + s.getRollNo());
            System.out.println(s);
        }

    }

}
