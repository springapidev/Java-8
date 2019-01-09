package com.coderbd.oopthinking.student.eduqua;

public class Exam {

    int id;
    String name;

    public Exam(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Exam{" + "id=" + id + ", name=" + name + '}';
    }

}
