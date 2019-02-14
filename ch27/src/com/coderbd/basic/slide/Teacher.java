/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.basic.slide;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Teacher {

    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("RR", 22);
        Teacher t2 = new Teacher("RR", 22);

        System.out.println("T1: " + t1.hashCode());
        System.out.println("T2: " + t2.hashCode());
        System.out.println(t1.equals(t2));
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teacher other = (Teacher) obj;
        return true;
    }

}
