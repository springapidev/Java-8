package com.coderbd.oopthinking.student;

public class Department {

    private int id;
    private String depName;

    public Department() {
    }

    public Department(int id, String depName) {
        this.id = id;
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", depName=" + depName + '}';
    }

}
