package com.coderbd.book;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("A");      
        set.add("B");
        set.add("C");

        System.out.println(set);
        Set<String> set2 = new HashSet();
        set2.add("D");
        set2.add("E");
        set2.add("F");
        set.retainAll(set2);
        // set.addAll(set2);
        System.out.println(set);
        System.out.println(set.size());

    }

}
