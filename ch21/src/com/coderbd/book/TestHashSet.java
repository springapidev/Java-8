package com.coderbd.book;

import java.util.*;

public class TestHashSet {

    public static void main(String[] args) {
        // Create a hash set
        Set<String> set = new HashSet();
        System.out.println("Size: " + set.size());
        // Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco...........");
        set.add("Beijing............");
        set.add("New York");

        System.out.println("Size: " + set.size());

        System.out.println(set);

        // Display the elements in the hash set
        for (String s : set) {
            System.out.print(s.toUpperCase() + " ");            
        }

        // Process the elements using a forEach method
        System.out.println();
        set.forEach(e -> System.out.print(e.toLowerCase() + " "));
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

}
