package com.coderbd.book;

import java.util.*;

public class TestTreeSet {

    public static void main(String[] args) {
        // Create a hash set
        Set<String> set = new HashSet<>();

        // Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set: " + treeSet);

        // Use the methods in SortedSet interface
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("headSet(\"London\"): "
                + treeSet.headSet("London"));
        System.out.println("tailSet(\"London\"): "
                + treeSet.tailSet("London"));

        // Use the methods in NavigableSet interface
        System.out.println("lower(\"S\"): " + treeSet.lower("S"));
        System.out.println("higher(\"S\"): " + treeSet.higher("S"));
        System.out.println("floor(\"P\"): " + treeSet.floor("P"));
        System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
        
        
         System.out.println("Before Pull tree set: " + treeSet);
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
          System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);
    }
}
