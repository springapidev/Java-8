package com.coderbd;

public class HelloWorldEight {

    public static void main(String[] args) {
        System.out.println(sayHello("Hello", " World.................!!!"));
        System.out.println(sayHelloo());
    }

    public static String sayHello(String s1, String s2) {
        return HelloWorldSix.sayHello(s1, s2);
    }

    public static String sayHelloo() {
        String msg = HelloWorldSix.sayHello("Hello ", "World");
        return msg;
    }
}
