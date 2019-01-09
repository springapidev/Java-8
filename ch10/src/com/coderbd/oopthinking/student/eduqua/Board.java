package com.coderbd.oopthinking.student.eduqua;

public class Board {

    int id;
    String name;

    public Board(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Board{" + "id=" + id + ", name=" + name + '}';
    }

   

}
