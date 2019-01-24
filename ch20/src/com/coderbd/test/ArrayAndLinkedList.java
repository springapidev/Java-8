package com.coderbd.test;
import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayAndLinkedList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
// ArrayList add
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("ArrayList add: nanos " + duration);
// LinkedList add
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedList add: nanos " + duration);
// ArrayList get
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayList.get(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("ArrayList get: nanos " + duration);

// LinkedList get
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            linkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedList get: nanos " + duration);

// ArrayList remove
        startTime = System.currentTimeMillis();

        for (int i = 99999; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("ArrayList remove: nanos " + duration);

// LinkedList remove
        startTime = System.currentTimeMillis();

        for (int i = 99999; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedList remove:nanos " + duration);
    }

}
