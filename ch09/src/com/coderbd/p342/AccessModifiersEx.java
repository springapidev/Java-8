package com.coderbd.p342;

/**
 *
 * @author User
 */
public class AccessModifiersEx {

    private int privateVar = 5000;
    int defaultVar = 1000;
    protected int protectedVar = 500;
    public int publicVar = 100;

    public static void main(String[] args) {
        AccessModifiersEx obj = new AccessModifiersEx();
        System.out.println(obj.privateVar);
        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.publicVar);
    }

}
