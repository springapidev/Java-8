package com.coderbd.basic;

// Java program to demonstrate 
// computeIfAbsent(Key, Function) method. 
import java.util.*;

public class GFG {

    // Main method 
    public static void main(String[] args) {

        // create a table and add some values 
        Map<String, Integer> table = new Hashtable<>();
        table.put("Pen", 10);
        table.put("Book", 500);
        table.put("Clothes", 400);
        table.put("Mobile", 5000);

        // print map details 
        System.out.println("hashTable: "
                + table.toString());

        // provide value for new key which is absent 
        // using computeIfAbsent method 
        table.computeIfAbsent("newPen", k -> 600);
        table.computeIfAbsent("newBook", k -> 800);

        // print new mapping 
        System.out.println("new hashTable: "
                + table);
    }
}
