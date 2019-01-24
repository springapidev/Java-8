package com.coderbd.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListStaticMethodsex {

    public static void main(String[] args) {
        List arrList = Arrays.asList("Arange", "green", "blue");
        arrList.forEach(System.out::println);
        Collections.sort(arrList, Collections.reverseOrder());
        arrList.forEach(System.out::println);
        Collections.shuffle(arrList);
        arrList.forEach(System.out::println);
    }

}
