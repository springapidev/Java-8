package com.coderbd.book;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("New York");
        list.add("Atlanta");
        list.add("Dallas");
        list.add("Madison");
        list.add("Dhaka");
        list.add("Bakha");
        System.out.println(list);
        List<String> subList = new ArrayList<>();
        subList = list.subList(1, 4);
        System.out.println(subList);

    }
}
