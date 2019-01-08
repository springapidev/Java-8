package com.coderbd.p337;

/**
 *
 * @author User
 */
public class StaticNonStaticExTest {

    public static void main(String[] args) {
        System.out.println(StaticNonStaticEx.y);
        StaticNonStaticEx obj2 = new StaticNonStaticEx();

        System.out.println(obj2.x);
    }
}
