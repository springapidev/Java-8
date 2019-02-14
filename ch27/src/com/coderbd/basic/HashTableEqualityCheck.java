package com.coderbd.basic;

import java.util.Hashtable;

public class HashTableEqualityCheck {

    public static void main(String[] arg) {
        // creating a hash table 
        Hashtable h = new Hashtable();

        Hashtable h1 = new Hashtable();

        h.put(3, "Programmers");
        h.put(2, "for USA");
        h.put(1, "isBest");

        h1.put(3, "Programmers");
        h1.put(2, "for USA");
        h1.put(1, "isBest");

        // checking whether both hash tables are equal or not 
        if (h.equals(h1)) {
            System.out.println("both are equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
