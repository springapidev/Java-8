package com.coderbd;

public class HelloWorldNine {

    public static void main(String[] args) {
        sayHello();
        System.out.println(sayHello("Hi......"));
        System.out.println(sayHello("Helloooooooo", " World"));
        System.out.println(sayHello("Only ", 100));
        System.out.println(sayHello(50, " Only"));
    }

    //Method Overloads
    public static void sayHello() {
        System.out.println("Hello World =======1==========");
    }

    public static String sayHello(String s1) {
        return s1;
    }

    public static String sayHello(String s1, String s2) {
        return s1 + s2;
    }

    public static String sayHello(String s1, int n1) {
        return s1 + n1;
    }

    public static String sayHello(int n1, String s1) {
        return n1 + s1;
    }
}
