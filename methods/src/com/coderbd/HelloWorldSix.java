package com.coderbd;

public class HelloWorldSix {

    public static void main(String[] args) {
        System.out.println(sayHello("Hello", " World"));
        System.out.println(addition(5, 10));
    }

    public static String sayHello(String msg1, String msg2) {
        String message = msg1 + msg2;
        return message;
    }

    public static int addition(int n1, int n2) {
        int rs = n1 + n2;
        return rs;
    }
}
