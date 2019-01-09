package com.coderbd.oopthinking.student.eduqua;

public class Institute {

    int id;
    String name;

    public Institute(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Institute{" + "id=" + id + ", name=" + name + '}';
    }

   

}
