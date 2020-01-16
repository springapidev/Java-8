package com.coderbd.p347;

public class Student {

    int id;
    String name;
    int roll;
    String className;
    static Student[] students = new Student[2];

    public Student() {

        students[0] = new Student(101, "Mr. A", 1, "X");
        students[1] = new Student(102, "Mr.B", 2, "X");
        getAllStudentDetails(students);
    }

    public Student(int id, String name, int roll, String className) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.className = className;

    }

    public static Student getAStudent(int id) {
        return students[id];
    }

    public void getDetails(Student student) {
        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);
        System.out.println("Roll: " + student.roll);
        System.out.println("Class Name: " + student.className);

    }

    public void getAllStudentDetails(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.id);
            System.out.println("Name: " + student.name);
            System.out.println("Roll: " + student.roll);
            System.out.println("Class Name: " + student.className);
            System.out.println("===========================");
        }

    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", roll=" + roll + ", className=" + className + '}';
    }

}
