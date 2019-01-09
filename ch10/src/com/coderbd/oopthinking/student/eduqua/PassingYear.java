package com.coderbd.oopthinking.student.eduqua;

public class PassingYear {

    int id;
    String name;

    public PassingYear(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PassingYear{" + "id=" + id + ", name=" + name + '}';
    }

}
