package com.coderbd.basic;

import java.util.Hashtable;

public class HashTableContainDemo {
    // Java code to illustrate the contains() method 

    public static void main(String[] args) {

        // Creating an empty Hashtable 
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();

        // Mapping string values to int keys 
        hash_table.put(10, "Programmers");
        hash_table.put(15, "4");
        hash_table.put(20, "You are");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");

        // Displaying the HashMap 
        System.out.println("Initial Table is: " + hash_table);

        // Checking for the Value 'Welcomes' 
        System.out.println("Is the value 'Welcomes' present? " + hash_table.contains("Welcomes"));

        // Checking for the Value 'Bangladesh' 
        System.out.println("Is the value 'Bangladesh' present? " + hash_table.contains("Bangladesh"));
    }
}
