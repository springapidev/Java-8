package com.coderbd;

import java.util.*;

public class Febo {

    public static void main(String[] args) {

        int a, b, c;
        for (a = 0, b = 1, c = 0; c <= 100; a = b, b = c, c = a + b) {
            System.out.print(c + " ");
        }
    }
}
