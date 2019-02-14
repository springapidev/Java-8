package com.coderbd.basic.slide;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Test {

    private static final String EXIT_KEYWORD = "exit";

    public static void main(final String[] args) {
        Hashtable<String, Integer> names = new Hashtable<String, Integer>();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String name = in.next();
            if (EXIT_KEYWORD.equals(name)) {
                break;
            }
            int age = in.nextInt();
            names.put(name, age);
        }

        for (Map.Entry<String, Integer> entry : names.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
