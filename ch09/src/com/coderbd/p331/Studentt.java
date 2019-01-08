package com.coderbd.p331;

import java.util.Objects;

public class Studentt {

    private final String name;
    private final int age;
    private final boolean isScienceMajor;
    private final char gender;

    public Studentt(String name, int age, boolean isScienceMajor, char gender) {
        this.name = name;
        this.age = age;
        this.isScienceMajor = isScienceMajor;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isIsScienceMajor() {
        return isScienceMajor;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.age;
        hash = 29 * hash + (this.isScienceMajor ? 1 : 0);
        hash = 29 * hash + this.gender;
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
        final Studentt other = (Studentt) obj;
        return true;
    }

    
}
