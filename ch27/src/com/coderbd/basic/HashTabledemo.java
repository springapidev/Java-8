package com.coderbd.basic;
// Java code illustrating clear() and clone() methods 

import java.util.*;

class HashTabledemo {

    public static void main(String[] arg) {

        // creating a hash table 
        Hashtable h = new Hashtable();

        Hashtable h1 = new Hashtable();

        h.put(3, "Minhaz");
        h.put(2, "Sowkot");
        h.put(1, "Yasin");
        System.out.println("values in clone: " + h);
        // create a clone or shallow copy of hash table h 
        h1 = (Hashtable) h.clone();

        // checking clone h1 
        System.out.println("values in clone: " + h1);

        // clear hash table h 
        h.clear();

        // checking hash table h 
        System.out.println("after clearing: " + h);
    }

}
