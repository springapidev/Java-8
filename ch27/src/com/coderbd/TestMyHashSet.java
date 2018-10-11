package com.coderbd;

import java.util.HashSet;

public class TestMyHashSet {

    public static void main(String[] args) {
        // Create a MyHashSet
        HashSet<String> test = new HashSet<>();
        test.add("Arefin");
        test.add("Smith");
        test.add("Anderson");
        test.add("Lewis");
        test.add("Cook");
        test.add("Smith");
        System.out.println(" ===== " + test);

        System.out.println("Test Size: " + test.size());
        MySet<String> set = new MyHashSet<>();
        set.add("Smith");
        set.add("Anderson");
        set.add("Lewis");
        set.add("Cook");
        set.add("Smith");

        System.out.println("Elements in set: " + set);
        System.out.println("Number of elements in set: " + set.size());
        System.out.println("Is Smith in set? " + set.contains("Smith"));

        set.remove("Smith");
        System.out.print("Names in set in uppercase are ");
        for (String s : set) {
            System.out.print(s.toUpperCase() + " ");
        }

        set.clear();
        System.out.println("\nElements in set: " + set);
    }
}
