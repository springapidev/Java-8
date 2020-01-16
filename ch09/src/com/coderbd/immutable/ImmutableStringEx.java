package com.coderbd.immutable;

public class ImmutableStringEx {

    public static void main(String[] args) {
        String name = "Hello";
        System.out.println(System.identityHashCode(name));
        System.out.println(name);
        name.concat(" World");
        System.out.println(System.identityHashCode(name));
        System.out.println(name);
        name.toUpperCase();
        System.out.println(System.identityHashCode(name));
        System.out.println(name);
        System.out.println("=============");
        name = "World";
        System.out.println(System.identityHashCode(name));
        System.out.println(name);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.toString());
        sb.append(" World");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.toString());

    }

}
