package com.coderbd.basic;

// Java code illustrating get() method 
import java.util.*;

class Vector_demo {

    public static void main(String[] arg) {

        // creating a hash table 
        Hashtable marks = new Hashtable();

        // enter name/marks pair 
        marks.put("tweener", new Integer(345));
        marks.put("krantz", new Double(245.78));
        marks.put("burrows", new Integer(790));
        marks.put("tancredi", new Double(365.98));
        marks.put("bellick", new Integer(435));

        // get the value mapped with key krantz 
        System.out.println(marks.get("krantz"));
    }
}
