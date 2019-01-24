package com.coderbd.book;

import java.util.*;

public class TestArrayAndLinkedList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // 1 is autoboxed to new Integer(1)
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10);
        arrayList.add(3, 30);

        System.out.println("A list of integers in the array list:");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(5, "red");
        // linkedList.removeLast();
        linkedList.addFirst("green");
        linkedList.addFirst("Orange");
        linkedList.addLast("BD");
        linkedList.add("yellow");
        linkedList.addFirst("Dhaka");
        linkedList.addLast("Chitagong");
        System.out.println("Display the linked list backward:");
        for (int i = 0; i <= linkedList.size() - 1; i++) {
            System.out.print(linkedList.get(i) + " ");
        }
//        System.out.println("");
//        for (int i = linkedList.size() - 1; i >= 0; i--) {
//            System.out.print(linkedList.get(i) + " ");
//        }
    }
}
