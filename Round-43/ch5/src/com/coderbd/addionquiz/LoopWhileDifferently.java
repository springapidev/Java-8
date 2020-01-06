package com.coderbd.addionquiz;

public class LoopWhileDifferently {

    public static void main(String[] args) {
        int count = 1;
        while (true) {
            if (count > 10) {
                break;
            }
            System.out.println("count: " + count);
            ++count;

        }
    }
}
