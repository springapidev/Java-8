package com.coderbd;

import static java.lang.Math.E;
import java.util.ArrayList;
import java.util.List;

public class BasicGenreics {

    public static void main(String[] args) {
        //Object List
        List list = new ArrayList();
        list.add(new Integer(1500000));
        list.add(new String("abc"));
        list.add(12);
        list.add("bd");
        list.add("bd");
        list.add("bd");

        list.forEach(System.out::println);

        System.out.println("12 is : " + list.contains(12));
        System.out.println("IndexOf: " + list.indexOf(12));
        list.add(4, 500);
        System.out.println("Last IndexOf: " + list.lastIndexOf(500));
        System.out.println("size: " + list.size());

        System.out.println("4: " + list.get(4));
        // list.remove(4);

        for (Object o : list) {
            System.out.println(o);
        }

        List<Integer> intList = new ArrayList();
        intList.add(1000);

    }

 
}
