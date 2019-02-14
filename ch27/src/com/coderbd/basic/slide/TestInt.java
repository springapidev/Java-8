package com.coderbd.basic.slide;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class TestInt {

    private static final Integer EXIT_KEYWORD = 999;

    public static void main(final String[] args) {
        Hashtable<Integer, Integer> arrs = new Hashtable<Integer, Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Start entering Key, Value");
        while (in.hasNext()) {
            Integer key = in.nextInt();
            if (EXIT_KEYWORD.equals(key)) {
                break;
            }
            int val = in.nextInt();
            arrs.put(key, val);
        }

        for (Map.Entry<Integer, Integer> entry : arrs.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
