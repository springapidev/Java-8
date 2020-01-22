package com.coderbd.interfaces.comparable.ex3;

import java.util.*;

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.age == s2.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
