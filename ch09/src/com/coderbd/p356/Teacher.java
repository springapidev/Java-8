package com.coderbd.p356;

public class Teacher {

    private int id;
    private String name;

    public Teacher(int sid, String name) {
        id = sid;
        this.name = name;
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher() {
        //  this("Rezaul");
        this(100, "Razaul");
    }

    public int getId() {
        return id;
    }

    public void setId(int newid) {
        id = newid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
