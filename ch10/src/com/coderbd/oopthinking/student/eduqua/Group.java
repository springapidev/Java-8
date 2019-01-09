package com.coderbd.oopthinking.student.eduqua;

public class Group {

    int id;
    String name;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" + "id=" + id + ", name=" + name + '}';
    }

   

}
