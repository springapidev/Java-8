package com.coderbd.oopthinking.student.eduqua;

public class CGPA {

    int id;
    String cgpa;

    public CGPA(int id, String cgpa) {
        this.id = id;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "CGPA{" + "id=" + id + ", cgpa=" + cgpa + '}';
    }

   

}
