package com.coderbd.basic;

import java.util.Hashtable;

public class HashCodeDemo {

    public static void main(String[] arg) {
        // creating a hash table 
        Hashtable h = new Hashtable();

        h.put(3, "BD");
        h.put(2, "forBD");
        h.put(1, "isBest");

        // obtaining hash code 
        System.out.println("hash code is: " + h.hashCode());
    }
}
