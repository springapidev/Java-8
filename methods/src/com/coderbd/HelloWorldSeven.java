package com.coderbd;

/**
 *
 * @author User
 */
public class HelloWorldSeven {

    public static void main(String[] args) {
        System.out.println(sayHello());
        System.out.println(sayHelloo());
    }

    public static String sayHello() {
        return HelloWorldSix.sayHello("Hello ", "World");
    }

    public static String sayHelloo() {
        String msg = HelloWorldSix.sayHello("Hello ", "World");
        return msg;
    }
}
