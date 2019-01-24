package com.coderbd.book.queuepriority;

import java.util.PriorityQueue;

public class CreatePriorityQueueExample {

    public static void main(String[] args) {
        // Create a Priority Queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        // Add items to a Priority Queue (ENQUEUE)
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);

        // Remove items from the Priority Queue (DEQUEUE)
        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }

    }
}
/*
Let’s create a Priority Queue of integers and add some integers to it. After adding the integers, we’ll remove them one by one from the priority queue and see how the smallest integer is removed first followed by the next smallest integer
 */
