package com.coderbd.basic;

import java.util.Hashtable;

public class CheckIfMoreKeyForAValue {

    public static void main(String[] arg) {
        // creating a hash table 
        Hashtable marks = new Hashtable();

        // enter name/marks pair 
        marks.put("tweener", new Integer(345));
        marks.put("krantz", new Double(245.78));
        marks.put("burrows", new Integer(790));
        marks.put("tancredi", new Double(365.98));
        marks.put("bellick", new Integer(435));

        // check whether a value exists or not 
        if (marks.containsValue(345)) {
            System.out.println("value found in table");
        }
    }
}
